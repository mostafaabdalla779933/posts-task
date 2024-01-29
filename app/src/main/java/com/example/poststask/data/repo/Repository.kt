package com.example.poststask.data.repo


import com.example.poststask.data.local.PostDao
import com.example.poststask.data.model.PostModel
import com.example.poststask.data.remote.ApiService
import com.example.poststask.di.IoDispatcher
import com.example.poststask.domain.repo.IRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(
    private val apiService: ApiService,
    private val postDAO: PostDao,
    @IoDispatcher private val dispatcher: CoroutineDispatcher
) : IRepository {

    override suspend fun getPosts(fromCache: Boolean): Flow<Response<List<PostModel>>> {
        return flow {
            if (fromCache) {
                val cache = postDAO.getPosts()
                if (cache.isEmpty()) {
                    val response = apiService.getPosts()
                    cacheResponse(response)
                    emit(response)
                } else {
                    emit(Response.success(cache))
                }
            } else {
                val response = apiService.getPosts()
                cacheResponse(response)
                emit(response)
            }
        }.flowOn(dispatcher)
    }

    override suspend fun getDetails(id: String): Flow<Response<PostModel>> {
        return flow {
            val response = apiService.getDetails("posts/$id")
            emit(response)
        }.flowOn(dispatcher)
    }


    private suspend fun cacheResponse(response: Response<List<PostModel>>) {
        if (response.isSuccessful && response.body()?.isEmpty() == false) {
            postDAO.clearCachedPosts()
            postDAO.addPosts(response.body() ?: emptyList())
        }
    }


}