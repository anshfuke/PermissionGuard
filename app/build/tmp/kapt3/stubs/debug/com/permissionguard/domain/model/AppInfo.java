package com.permissionguard.domain.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u00c6\u0003J\t\u0010\"\u001a\u00020\nH\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\rH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003Ja\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001J\u0013\u0010\'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020\u0006H\u00d6\u0001J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006+"}, d2 = {"Lcom/permissionguard/domain/model/AppInfo;", "", "appName", "", "packageName", "totalPermissions", "", "dangerousPermissions", "", "riskLevel", "Lcom/permissionguard/domain/model/RiskLevel;", "riskReason", "isSideloaded", "", "icon", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lcom/permissionguard/domain/model/RiskLevel;Ljava/lang/String;ZLandroid/graphics/Bitmap;)V", "getAppName", "()Ljava/lang/String;", "getDangerousPermissions", "()Ljava/util/List;", "getIcon", "()Landroid/graphics/Bitmap;", "()Z", "getPackageName", "getRiskLevel", "()Lcom/permissionguard/domain/model/RiskLevel;", "getRiskReason", "getTotalPermissions", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class AppInfo {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String appName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String packageName = null;
    private final int totalPermissions = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> dangerousPermissions = null;
    @org.jetbrains.annotations.NotNull()
    private final com.permissionguard.domain.model.RiskLevel riskLevel = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String riskReason = null;
    private final boolean isSideloaded = false;
    @org.jetbrains.annotations.Nullable()
    private final android.graphics.Bitmap icon = null;
    
    public AppInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String appName, @org.jetbrains.annotations.NotNull()
    java.lang.String packageName, int totalPermissions, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> dangerousPermissions, @org.jetbrains.annotations.NotNull()
    com.permissionguard.domain.model.RiskLevel riskLevel, @org.jetbrains.annotations.NotNull()
    java.lang.String riskReason, boolean isSideloaded, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap icon) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPackageName() {
        return null;
    }
    
    public final int getTotalPermissions() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDangerousPermissions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.permissionguard.domain.model.RiskLevel getRiskLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRiskReason() {
        return null;
    }
    
    public final boolean isSideloaded() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap getIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.permissionguard.domain.model.RiskLevel component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.permissionguard.domain.model.AppInfo copy(@org.jetbrains.annotations.NotNull()
    java.lang.String appName, @org.jetbrains.annotations.NotNull()
    java.lang.String packageName, int totalPermissions, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> dangerousPermissions, @org.jetbrains.annotations.NotNull()
    com.permissionguard.domain.model.RiskLevel riskLevel, @org.jetbrains.annotations.NotNull()
    java.lang.String riskReason, boolean isSideloaded, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap icon) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}