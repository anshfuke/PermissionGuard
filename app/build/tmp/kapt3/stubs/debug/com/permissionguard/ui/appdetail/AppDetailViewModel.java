package com.permissionguard.ui.appdetail;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/permissionguard/ui/appdetail/AppDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "appScanner", "Lcom/permissionguard/domain/scanner/AppScanner;", "(Lcom/permissionguard/domain/scanner/AppScanner;)V", "_appInfo", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/permissionguard/domain/model/AppInfo;", "_permissionDetails", "", "Lcom/permissionguard/domain/model/PermissionEntry;", "appInfo", "Lkotlinx/coroutines/flow/StateFlow;", "getAppInfo", "()Lkotlinx/coroutines/flow/StateFlow;", "permissionDetails", "getPermissionDetails", "loadAppDetails", "", "packageName", "", "app_debug"})
public final class AppDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.permissionguard.domain.scanner.AppScanner appScanner = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.permissionguard.domain.model.AppInfo> _appInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.permissionguard.domain.model.AppInfo> appInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.permissionguard.domain.model.PermissionEntry>> _permissionDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.permissionguard.domain.model.PermissionEntry>> permissionDetails = null;
    
    public AppDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.permissionguard.domain.scanner.AppScanner appScanner) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.permissionguard.domain.model.AppInfo> getAppInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.permissionguard.domain.model.PermissionEntry>> getPermissionDetails() {
        return null;
    }
    
    public final void loadAppDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String packageName) {
    }
}