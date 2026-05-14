package com.permissionguard.ui.appdetail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.permissionguard.domain.model.PermissionEntry
import com.permissionguard.domain.model.RiskLevel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppDetailScreen(packageName: String, viewModel: AppDetailViewModel, onBackClick: () -> Unit) {
    val appInfo by viewModel.appInfo.collectAsState()
    val permissionDetails by viewModel.permissionDetails.collectAsState()

    LaunchedEffect(packageName) {
        viewModel.loadAppDetails(packageName)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("App Details") },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { innerPadding ->
        if (appInfo == null) {
            Box(modifier = Modifier.fillMaxSize().padding(innerPadding), contentAlignment = Alignment.Center) {
                CircularProgressIndicator()
            }
            return@Scaffold
        }

        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(innerPadding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                appInfo?.let { app ->
                    Card(modifier = Modifier.fillMaxWidth()) {
                        Column(modifier = Modifier.fillMaxWidth().padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                            app.icon?.let { bitmap ->
                                Image(
                                    bitmap = bitmap.asImageBitmap(),
                                    contentDescription = "App Icon",
                                    modifier = Modifier.size(80.dp)
                                )
                                Spacer(modifier = Modifier.height(16.dp))
                            }
                            Text(text = app.appName, style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold)
                            Text(text = app.packageName, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
                            
                            Spacer(modifier = Modifier.height(16.dp))
                            
                            val riskColor = when (app.riskLevel) {
                                RiskLevel.HIGH -> MaterialTheme.colorScheme.error
                                RiskLevel.MEDIUM -> androidx.compose.ui.graphics.Color(0xFFFFB300)
                                RiskLevel.LOW -> androidx.compose.ui.graphics.Color(0xFF4CAF50)
                            }
                            
                            Badge(containerColor = riskColor) {
                                Text(text = "Risk: ${app.riskLevel.name}", modifier = Modifier.padding(8.dp), style = MaterialTheme.typography.titleSmall)
                            }
                        }
                    }
                }
            }
            
            item {
                Text("Requested Dangerous Permissions", style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
            }

            items(permissionDetails) { entry ->
                PermissionCard(entry)
            }
            
            if (permissionDetails.isEmpty()) {
                item {
                    Text("This app does not request any dangerous permissions.", style = MaterialTheme.typography.bodyLarge)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PermissionCard(entry: PermissionEntry) {
    val riskColor = when (entry.riskLevel) {
        RiskLevel.HIGH -> MaterialTheme.colorScheme.error
        RiskLevel.MEDIUM -> androidx.compose.ui.graphics.Color(0xFFFFB300)
        RiskLevel.LOW -> androidx.compose.ui.graphics.Color(0xFF4CAF50)
    }

    Card(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = entry.name, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
                Badge(containerColor = riskColor) {
                    Text(text = entry.riskLevel.name, modifier = Modifier.padding(4.dp))
                }
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = entry.id, style = MaterialTheme.typography.labelSmall, color = MaterialTheme.colorScheme.primary)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = entry.description, style = MaterialTheme.typography.bodyMedium)
        }
    }
}
        
