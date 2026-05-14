package com.permissionguard.service

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.IBinder
import android.app.AppOpsManager
import androidx.core.app.NotificationCompat
import com.permissionguard.data.local.AppDatabase
import com.permissionguard.data.repository.PermissionRepository
import com.permissionguard.domain.model.PermissionEvent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

class PermissionMonitorService : Service() {

    private val serviceJob = SupervisorJob()
    private val serviceScope = CoroutineScope(Dispatchers.IO + serviceJob)
    
    private lateinit var repository: PermissionRepository
    private lateinit var appOpsManager: AppOpsManager
    
    private val CHANNEL_ID = "PermissionMonitorChannel"
    private val NOTIFICATION_ID = 1

    private val appOpsListener = AppOpsManager.OnOpChangedListener { op, packageName ->
        handleAppOpChange(op, packageName)
    }

    override fun onCreate() {
        super.onCreate()
        val dao = AppDatabase.getDatabase(applicationContext).permissionEventDao()
        repository = PermissionRepository(dao)
        appOpsManager = getSystemService(Context.APP_OPS_SERVICE) as AppOpsManager
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        createNotificationChannel()
        
        val notification = NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("PermissionGuard Active")
            .setContentText("Monitoring camera and microphone usage.")
            .setSmallIcon(android.R.drawable.ic_secure) // Using standard icon for now
            .setOngoing(true)
            .build()
            
        startForeground(NOTIFICATION_ID, notification)
        startMonitoring()
        
        return START_STICKY
    }

    private fun startMonitoring() {
        try {
            // Register listener for Camera and Microphone
            // Note: On Android 11+, this will only receive events for our own app unless we have WATCH_APPOPS permission via ADB
            appOpsManager.startWatchingMode(AppOpsManager.OPSTR_CAMERA, null, appOpsListener)
            appOpsManager.startWatchingMode(AppOpsManager.OPSTR_RECORD_AUDIO, null, appOpsListener)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun handleAppOpChange(op: String, packageName: String) {
        // Skip our own package to avoid noise
        if (packageName == this.packageName) return
        
        val permissionType = when (op) {
            AppOpsManager.OPSTR_CAMERA -> "CAMERA"
            AppOpsManager.OPSTR_RECORD_AUDIO -> "MICROPHONE"
            else -> "UNKNOWN"
        }

        if (permissionType != "UNKNOWN") {
            val event = PermissionEvent(
                packageName = packageName,
                permissionType = permissionType,
                timestamp = System.currentTimeMillis()
            )
            serviceScope.launch {
                repository.insertEvent(event)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        appOpsManager.stopWatchingMode(appOpsListener)
        serviceJob.cancel()
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                "Permission Monitor",
                NotificationManager.IMPORTANCE_LOW
            ).apply {
                description = "Monitors app permissions in background"
            }
            val manager = getSystemService(NotificationManager::class.java)
            manager.createNotificationChannel(channel)
        }
    }
}
