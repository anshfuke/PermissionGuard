package com.permissionguard.domain.scanner;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0016\u0010\u000f\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0002J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\rJ\u0016\u0010\u0012\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006H\u0002J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/permissionguard/domain/scanner/AppScanner;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cachedApps", "", "Lcom/permissionguard/domain/model/AppInfo;", "lastFingerprint", "", "calculateRiskLevel", "Lcom/permissionguard/domain/model/RiskLevel;", "dangerousPermissions", "", "installSource", "generateRiskReason", "getAppInfo", "packageName", "getAppsFingerprint", "packages", "Landroid/content/pm/PackageInfo;", "getInstalledApps", "app_debug"})
public final class AppScanner {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.permissionguard.domain.model.AppInfo> cachedApps;
    private long lastFingerprint = 0L;
    
    public AppScanner(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final long getAppsFingerprint(java.util.List<? extends android.content.pm.PackageInfo> packages) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.permissionguard.domain.model.AppInfo> getInstalledApps() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.permissionguard.domain.model.AppInfo getAppInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String packageName) {
        return null;
    }
    
    private final com.permissionguard.domain.model.RiskLevel calculateRiskLevel(java.util.List<java.lang.String> dangerousPermissions, java.lang.String installSource) {
        return null;
    }
    
    private final java.lang.String generateRiskReason(java.util.List<java.lang.String> dangerousPermissions) {
        return null;
    }
}