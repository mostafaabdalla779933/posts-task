package com.example.poststask.domain.usecase;

import java.lang.System;

@dagger.hilt.android.scopes.ViewModelScoped
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J+\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/poststask/domain/usecase/HomeUseCase;", "", "repository", "Lcom/example/poststask/domain/repo/IRepository;", "(Lcom/example/poststask/domain/repo/IRepository;)V", "getPosts", "Lkotlinx/coroutines/flow/Flow;", "Lretrofit2/Response;", "", "Lcom/example/poststask/data/model/PostModel;", "fromCache", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class HomeUseCase {
    private final com.example.poststask.domain.repo.IRepository repository = null;
    
    @javax.inject.Inject
    public HomeUseCase(@org.jetbrains.annotations.NotNull
    com.example.poststask.domain.repo.IRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getPosts(boolean fromCache, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<retrofit2.Response<java.util.List<com.example.poststask.data.model.PostModel>>>> continuation) {
        return null;
    }
}