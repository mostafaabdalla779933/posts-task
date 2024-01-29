package com.example.poststask.domain.usecase


import com.example.poststask.data.model.PostModel
import com.example.poststask.domain.repo.IRepository
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import javax.inject.Inject


@ViewModelScoped
class HomeUseCase @Inject constructor(private val repository: IRepository)  {


    suspend fun getPosts(fromCache: Boolean): Flow<Response<List<PostModel>>> {
        return repository.getPosts(fromCache)
    }


}