package com.example.poststask.ui.home.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0013\u0014\u0015\u0016B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/example/poststask/ui/home/adapters/PostsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/poststask/data/model/PostModel;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onClick", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "getItemViewType", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "PostsViewHolder", "ShimmerViewHolder", "UserDiffCallback", "app_debug"})
public final class PostsAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.poststask.data.model.PostModel, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.example.poststask.data.model.PostModel, kotlin.Unit> onClick = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.poststask.ui.home.adapters.PostsAdapter.Companion Companion = null;
    public static final int SHIMMER_TYPE = 1;
    public static final int VIEW_TYPE = 2;
    
    public PostsAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.poststask.data.model.PostModel, kotlin.Unit> onClick) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<com.example.poststask.data.model.PostModel, kotlin.Unit> getOnClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/poststask/ui/home/adapters/PostsAdapter$PostsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rowView", "Lcom/example/poststask/databinding/ItemPostBinding;", "(Lcom/example/poststask/ui/home/adapters/PostsAdapter;Lcom/example/poststask/databinding/ItemPostBinding;)V", "onBind", "", "item", "Lcom/example/poststask/data/model/PostModel;", "position", "", "app_debug"})
    public final class PostsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.poststask.databinding.ItemPostBinding rowView = null;
        
        public PostsViewHolder(@org.jetbrains.annotations.NotNull
        com.example.poststask.databinding.ItemPostBinding rowView) {
            super(null);
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull
        com.example.poststask.data.model.PostModel item, int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/poststask/ui/home/adapters/PostsAdapter$ShimmerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rowView", "Lcom/example/poststask/databinding/ItemPostShimmerBinding;", "(Lcom/example/poststask/ui/home/adapters/PostsAdapter;Lcom/example/poststask/databinding/ItemPostShimmerBinding;)V", "app_debug"})
    public final class ShimmerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.poststask.databinding.ItemPostShimmerBinding rowView = null;
        
        public ShimmerViewHolder(@org.jetbrains.annotations.NotNull
        com.example.poststask.databinding.ItemPostShimmerBinding rowView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/poststask/ui/home/adapters/PostsAdapter$UserDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/poststask/data/model/PostModel;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class UserDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.poststask.data.model.PostModel> {
        
        public UserDiffCallback() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.example.poststask.data.model.PostModel oldItem, @org.jetbrains.annotations.NotNull
        com.example.poststask.data.model.PostModel newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.example.poststask.data.model.PostModel oldItem, @org.jetbrains.annotations.NotNull
        com.example.poststask.data.model.PostModel newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/poststask/ui/home/adapters/PostsAdapter$Companion;", "", "()V", "SHIMMER_TYPE", "", "VIEW_TYPE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}