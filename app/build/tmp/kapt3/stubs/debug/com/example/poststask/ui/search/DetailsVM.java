package com.example.poststask.ui.search;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/example/poststask/ui/search/DetailsVM;", "Landroidx/lifecycle/ViewModel;", "useCase", "Lcom/example/poststask/domain/usecase/DetailsUserCase;", "(Lcom/example/poststask/domain/usecase/DetailsUserCase;)V", "jobs", "", "Lkotlinx/coroutines/Job;", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/poststask/ui/search/state/DetailsState;", "getState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getUseCase", "()Lcom/example/poststask/domain/usecase/DetailsUserCase;", "getDetails", "", "id", "", "onClear", "app_debug"})
public final class DetailsVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.poststask.domain.usecase.DetailsUserCase useCase = null;
    private final java.util.List<kotlinx.coroutines.Job> jobs = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.poststask.ui.search.state.DetailsState> state = null;
    
    @javax.inject.Inject
    public DetailsVM(@org.jetbrains.annotations.NotNull
    com.example.poststask.domain.usecase.DetailsUserCase useCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.poststask.domain.usecase.DetailsUserCase getUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.example.poststask.ui.search.state.DetailsState> getState() {
        return null;
    }
    
    public final void getDetails(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
    }
    
    public final void onClear() {
    }
}