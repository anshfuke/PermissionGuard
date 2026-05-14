package com.permissionguard.ui.apps;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\tJ\u0006\u0010\u001d\u001a\u00020\u0018R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/permissionguard/ui/apps/AppsViewModel;", "Landroidx/lifecycle/ViewModel;", "appScanner", "Lcom/permissionguard/domain/scanner/AppScanner;", "(Lcom/permissionguard/domain/scanner/AppScanner;)V", "_currentFilter", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/permissionguard/ui/apps/AppFilter;", "_searchQuery", "", "_uiState", "Lcom/permissionguard/ui/apps/AppsUiState;", "allApps", "", "Lcom/permissionguard/domain/model/AppInfo;", "currentFilter", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentFilter", "()Lkotlinx/coroutines/flow/StateFlow;", "searchQuery", "getSearchQuery", "uiState", "getUiState", "applyFilters", "", "onFilterChanged", "filter", "onSearchQueryChanged", "query", "scanApps", "app_debug"})
public final class AppsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.permissionguard.domain.scanner.AppScanner appScanner = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.permissionguard.ui.apps.AppsUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.permissionguard.ui.apps.AppsUiState> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.permissionguard.domain.model.AppInfo> allApps;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _searchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> searchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.permissionguard.ui.apps.AppFilter> _currentFilter = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.permissionguard.ui.apps.AppFilter> currentFilter = null;
    
    public AppsViewModel(@org.jetbrains.annotations.NotNull()
    com.permissionguard.domain.scanner.AppScanner appScanner) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.permissionguard.ui.apps.AppsUiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.permissionguard.ui.apps.AppFilter> getCurrentFilter() {
        return null;
    }
    
    public final void scanApps() {
    }
    
    public final void onSearchQueryChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public final void onFilterChanged(@org.jetbrains.annotations.NotNull()
    com.permissionguard.ui.apps.AppFilter filter) {
    }
    
    private final void applyFilters() {
    }
}