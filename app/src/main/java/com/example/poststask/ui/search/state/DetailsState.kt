package com.example.poststask.ui.search.state

import com.example.poststask.data.model.PostModel

class DetailsState(
    val isLoading: Boolean = false,
    val post: PostModel? = null,
    val error: String? = null
)