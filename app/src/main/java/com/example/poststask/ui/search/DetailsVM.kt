package com.example.poststask.ui.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.poststask.common.handleError
import com.example.poststask.domain.usecase.DetailsUserCase
import com.example.poststask.ui.search.state.DetailsState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class DetailsVM @Inject constructor(val useCase: DetailsUserCase) : ViewModel() {


    private val jobs = mutableListOf<Job>()
    val state = MutableStateFlow(DetailsState())

    fun getDetails(id: String) {
        viewModelScope.launch {
            useCase.getDetails(id)
                .onStart {
                    state.value = DetailsState(isLoading = true)
                }.onEach { response ->
                    if (response.isSuccessful) {
                        response.body()?.let {
                            state.value = DetailsState(
                                isLoading = false,
                                post = it
                            )
                        } ?: kotlin.run {
                            state.value = DetailsState(
                                isLoading = false,
                                error = "Something Went Wrong"
                            )
                        }
                    }
                }.catch {
                    state.value =
                        DetailsState(isLoading = false, error = handleError(it))
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