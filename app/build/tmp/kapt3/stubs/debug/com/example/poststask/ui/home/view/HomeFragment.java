package com.example.poststask.ui.home.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\u001a\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/example/poststask/ui/home/view/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/poststask/databinding/FragmentHomeBinding;", "postsAdapter", "Lcom/example/poststask/ui/home/adapters/PostsAdapter;", "getPostsAdapter", "()Lcom/example/poststask/ui/home/adapters/PostsAdapter;", "postsAdapter$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/example/poststask/ui/home/view/HomeVM;", "handlePostsState", "", "state", "Lcom/example/poststask/ui/home/state/PostsState;", "initView", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "showError", "error", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private com.example.poststask.databinding.FragmentHomeBinding binding;
    private com.example.poststask.ui.home.view.HomeVM viewModel;
    private final kotlin.Lazy postsAdapter$delegate = null;
    
    public HomeFragment() {
        super();
    }
    
    private final com.example.poststask.ui.home.adapters.PostsAdapter getPostsAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void handlePostsState(com.example.poststask.ui.home.state.PostsState state) {
    }
    
    private final void showError(java.lang.String error) {
    }
    
    private final void initView() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}