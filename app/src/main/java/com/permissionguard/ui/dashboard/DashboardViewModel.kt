package com.permissionguard.ui.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.permissionguard.data.repository.PermissionRepository
import com.permissionguard.domain.model.RiskLevel
import com.permissionguard.domain.scanner.AppScanner
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class DashboardUiState(
    val totalApps: Int = 0,
    val highRiskApps: Int = 0,
    val mediumRiskApps: Int = 0,
    val lowRiskApps: Int = 0,
    val securityScore: Int = 100,
    val totalLoggedEvents: Int = 0,
    val isLoading: Boolean = true
)

class DashboardViewModel(
    private val appScanner: AppScanner,
    private val repository: PermissionRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(DashboardUiState())
    val uiState: StateFlow<DashboardUiState> = _uiState.asStateFlow()

    init {
        loadDashboardData()
        observeEvents()
    }

    private fun loadDashboardData() {
        viewModelScope.launch(Dispatchers.IO) {
            val apps = appScanner.getInstalledApps()
            val high = apps.count { it.riskLevel == RiskLevel.HIGH }
            val medium = apps.count { it.riskLevel == RiskLevel.MEDIUM }
            val low = apps.count { it.riskLevel == RiskLevel.LOW }
            
            // Calculate a score from 0-100 based on app risk
            val penalty = (high * 15) + (medium * 5)
            val finalScore = (100 - penalty).coerceIn(0, 100)
            
            _uiState.value = _uiState.value.copy(
                totalApps = apps.size,
                highRiskApps = high,
                mediumRiskApps = medium,
                lowRiskApps = low,
                securityScore = finalScore,
                isLoading = false
            )
        }
    }

    private fun observeEvents() {
        viewModelScope.launch {
            repository.getAllEvents().collect { events ->
                _uiState.value = _uiState.value.copy(
                    totalLoggedEvents = events.size
                )
            }
        }
    }
}
