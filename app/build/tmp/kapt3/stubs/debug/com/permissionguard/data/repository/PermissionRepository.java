package com.permissionguard.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/permissionguard/data/repository/PermissionRepository;", "", "dao", "Lcom/permissionguard/data/local/PermissionEventDao;", "(Lcom/permissionguard/data/local/PermissionEventDao;)V", "clearLogs", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllEvents", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/permissionguard/domain/model/PermissionEvent;", "insertEvent", "event", "(Lcom/permissionguard/domain/model/PermissionEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PermissionRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.permissionguard.data.local.PermissionEventDao dao = null;
    
    public PermissionRepository(@org.jetbrains.annotations.NotNull()
    com.permissionguard.data.local.PermissionEventDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.permissionguard.domain.model.PermissionEvent>> getAllEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertEvent(@org.jetbrains.annotations.NotNull()
    com.permissionguard.domain.model.PermissionEvent event, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clearLogs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}