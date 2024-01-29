package com.example.poststask.ui.home.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.poststask.common.handleError
import com.example.poststask.domain.usecase.HomeUseCase
import com.example.poststask.ui.home.state.PostsState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class HomeVM @Inject constructor(val useCase: HomeUseCase) : ViewModel() {


    private val jobs = mutableListOf<Job>()
    val state = MutableStateFlow(PostsState())


    fun getPosts(fromCache: Boolean = true) {
        viewModelScope.launch {
            useCase.getPosts(fromCache)
                .onStart {
                    state.value = PostsState(isLoading = true)
                }.onEach { response ->
                    if (response.isSuccessful) {
                        response.body()?.let {
                            state.value = PostsState(
                                isLoading = false,
                                posts = it ?: emptyList()
                            )
                        } ?: kotlin.run {
                            state.value = PostsState(
                                isLoading = false,
                                error = "Something Went Wrong"
                            )
                        }
                    }
                }.catch {
                    state.value =
                        PostsState(isLoading = false, error = handleError(it))
                }.launchIn(viewModelScope).also { jobs.add(it) }
        }
    }



    fun onClear() {
        jobs.forEach { job ->
            if (job.isActive)
                job.cancel()
        }
    }

}