package com.permissionguard.ui.dashboard

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun DashboardScreen(viewModel: DashboardViewModel) {
    val uiState by viewModel.uiState.collectAsState()

    if (uiState.isLoading) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            CircularProgressIndicator()
        }
        return
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Security Dashboard", style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold)

        // Animated Security Score Ring
        var animationPlayed by remember { mutableStateOf(false) }
        val targetProgress = uiState.securityScore / 100f
        val animatedProgress by animateFloatAsState(
            targetValue = if (animationPlayed) targetProgress else 0f,
            animationSpec = tween(durationMillis = 1500),
            label = "ScoreAnimation"
        )
        
        LaunchedEffect(key1 = true) {
            animationPlayed = true
        }

        Box(
            modifier = Modifier
                .size(200.dp)
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator(
                progress = { animatedProgress },
                modifier = Modifier.fillMaxSize(),
                strokeWidth = 14.dp,
                color = when {
                    uiState.securityScore >= 80 -> Color(0xFF4CAF50)
                    uiState.securityScore >= 50 -> Color(0xFFFFC107)
                    else -> Color(0xFFF44336)
                },
                trackColor = MaterialTheme.colorScheme.surfaceVariant
            )
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "${uiState.securityScore}",
                    style = MaterialTheme.typography.displayLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Text(text = "Score", style = MaterialTheme.typography.labelLarge)
            }
        }

        // Risk Distribution Card
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
                Text("App Risk Distribution", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(16.dp))
                
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    RiskStatItem("Safe", uiState.lowRiskApps, Color(0xFF4CAF50))
                    RiskStatItem("Medium", uiState.mediumRiskApps, Color(0xFFFFB300))
                    RiskStatItem("High", uiState.highRiskApps, Color(0xFFE53935))
                }
                
                Spacer(modifier = Modifier.height(20.dp))
                Divider()
                Spacer(modifier = Modifier.height(12.dp))
                Text("Total Apps Scanned: ${uiState.totalApps}", style = MaterialTheme.typography.bodySmall)
            }
        }

        // Event Logs Card
        Card(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier.padding(20.dp).fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Active Background Events", style = MaterialTheme.typography.titleMedium)
                Badge(containerColor = MaterialTheme.colorScheme.primary) {
                    Text(text = "${uiState.totalLoggedEvents}", modifier = Modifier.padding(4.dp))
                }
            }
        }
    }
}

@Composable
fun RiskStatItem(label: String, count: Int, color: Color) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = count.toString(), style = MaterialTheme.typography.headlineMedium, color = color, fontWeight = FontWeight.Bold)
        Text(text = label, style = MaterialTheme.typography.bodyMedium)
    }
}
