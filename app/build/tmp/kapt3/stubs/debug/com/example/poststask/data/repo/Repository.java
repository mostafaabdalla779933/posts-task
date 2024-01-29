package com.example.poststask.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\f0\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J+\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/example/poststask/data/repo/Repository;", "Lcom/example/poststask/domain/repo/IRepository;", "apiService", "Lcom/example/poststask/data/remote/ApiService;", "postDAO", "Lcom/example/poststask/data/local/PostDao;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/example/poststask/data/remote/ApiService;Lcom/example/poststask/data/local/PostDao;Lkotlinx/coroutines/CoroutineDispatcher;)V", "cacheResponse", "", "response", "Lretrofit2/Response;", "", "Lcom/example/poststask/data/model/PostModel;", "(Lretrofit2/Response;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDetails", "Lkotlinx/coroutines/flow/Flow;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPosts", "fromCache", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class Repository implements com.example.poststask.domain.repo.IRepository {
    private final com.example.poststask.data.remote.ApiService apiService = null;
    private final com.example.poststask.data.local.PostDao postDAO = null;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    
    @javax.inject.Inject
    public Repository(@org.jetbrains.annotations.NotNull
    com.example.poststask.data.remote.ApiService apiService, @org.jetbrains.annotations.NotNull
    com.example.poststask.data.local.PostDao postDAO, @org.jetbrains.annotations.NotNull
    @com.example.poststask.di.IoDispatcher
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getPosts(boolean fromCache, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<retrofit2.Response<java.util.List<com.example.poststask.data.model.PostModel>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getDetails(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<retrofit2.Response<com.example.poststask.data.model.PostModel>>> continuation) {
        return null;
    }
    
    private final java.lang.Object cacheResponse(retrofit2.Response<java.util.List<com.example.poststask.data.model.PostModel>> response, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}