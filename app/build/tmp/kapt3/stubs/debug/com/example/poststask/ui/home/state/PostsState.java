package com.example.poststask.ui.home.state;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/poststask/ui/home/state/PostsState;", "", "isLoading", "", "posts", "", "Lcom/example/poststask/data/model/PostModel;", "error", "", "(ZLjava/util/List;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "()Z", "getPosts", "()Ljava/util/List;", "app_debug"})
public final class PostsState {
    private final boolean isLoading = false;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.poststask.data.model.PostModel> posts = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String error = null;
    
    public PostsState() {
        super();
    }
    
    public PostsState(boolean isLoading, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.poststask.data.model.PostModel> posts, @org.jetbrains.annotations.Nullable
    java.lang.String error) {
        super();
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.poststask.data.model.PostModel> getPosts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getError() {
        return null;
    }
}