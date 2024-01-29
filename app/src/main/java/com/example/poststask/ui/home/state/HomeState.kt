package com.example.poststask.ui.home.state

import com.example.poststask.data.model.PostModel


class PostsState(
    val isLoading: Boolean = true,
    val posts: List<PostModel?> = emptyList(),
    val error: String? = null
)