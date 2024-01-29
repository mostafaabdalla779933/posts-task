package com.example.poststask.domain.repo

import com.example.poststask.data.model.PostModel
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface IRepository {

    suspend fun getPosts(fromCache:Boolean) : Flow<Response<List<PostModel>>>

    suspend fun getDetails(id:String): Flow<Response<PostModel>>

}