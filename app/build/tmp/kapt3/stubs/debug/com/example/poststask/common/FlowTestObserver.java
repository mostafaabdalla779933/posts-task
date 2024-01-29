package com.example.poststask.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0011\u0010\n\u001a\u00028\u0000H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/poststask/common/FlowTestObserver;", "T", "", "()V", "latch", "Ljava/util/concurrent/CountDownLatch;", "values", "", "getValues", "()Ljava/util/List;", "awaitValue", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onChanged", "", "newValue", "(Ljava/lang/Object;)V", "app_debug"})
public final class FlowTestObserver<T extends java.lang.Object> {
    private final java.util.concurrent.CountDownLatch latch = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<T> values = null;
    
    public FlowTestObserver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<T> getValues() {
        return null;
    }
    
    public final void onChanged(T newValue) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object awaitValue(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super T> continuation) {
        return null;
    }
}