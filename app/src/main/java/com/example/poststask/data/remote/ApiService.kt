package com.example.poststask.data.remote


import com.example.poststask.data.model.PostModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {

    @GET("posts")
    suspend fun getPosts(): Response<List<PostModel>>


    @GET
    suspend fun getDetails(@Url api: String): Response<PostModel>
}