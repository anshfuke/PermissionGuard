package com.permissionguard.ui.monitor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/permissionguard/ui/monitor/MonitorViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/permissionguard/data/repository/PermissionRepository;", "(Lcom/permissionguard/data/repository/PermissionRepository;)V", "_isServiceRunning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "events", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/permissionguard/domain/model/PermissionEvent;", "getEvents", "()Lkotlinx/coroutines/flow/StateFlow;", "isServiceRunning", "clearLogs", "", "toggleService", "context", "Landroid/content/Context;", "app_debug"})
public final class MonitorViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.permissionguard.data.repository.PermissionRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.permissionguard.domain.model.PermissionEvent>> events = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isServiceRunning = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isServiceRunning = null;
    
    public MonitorViewModel(@org.jetbrains.annotations.NotNull()
    com.permissionguard.data.repository.PermissionRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.permissionguard.domain.model.PermissionEvent>> getEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isServiceRunning() {
        return null;
    }
    
    public final void toggleService(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void clearLogs() {
    }
}