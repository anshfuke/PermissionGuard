package com.permissionguard.ui.monitor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a:\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bH\u0007\u001a\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0007\u001a\u0010\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0016H\u0007\u00a8\u0006\u0017"}, d2 = {"ActivityStatCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "count", "", "label", "FilterChipUI", "isSelected", "", "LiveStatusCard", "title", "status", "time", "isActive", "MonitorScreen", "viewModel", "Lcom/permissionguard/ui/monitor/MonitorViewModel;", "TimelineEventItem", "event", "Lcom/permissionguard/domain/model/PermissionEvent;", "app_debug"})
public final class MonitorScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void MonitorScreen(@org.jetbrains.annotations.NotNull()
    com.permissionguard.ui.monitor.MonitorViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void FilterChipUI(@org.jetbrains.annotations.NotNull()
    java.lang.String label, boolean isSelected) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void LiveStatusCard(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.graphics.vector.ImageVector icon, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String time, boolean isActive) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ActivityStatCard(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.graphics.vector.ImageVector icon, @org.jetbrains.annotations.NotNull()
    java.lang.String count, @org.jetbrains.annotations.NotNull()
    java.lang.String label) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void TimelineEventItem(@org.jetbrains.annotations.NotNull()
    com.permissionguard.domain.model.PermissionEvent event) {
    }
}