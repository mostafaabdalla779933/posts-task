package com.example.poststask.data.local

import androidx.room.*
import com.example.poststask.data.model.PostModel


@Dao
interface PostDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addPost(post : PostModel) : Long


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addPosts(post: List<PostModel?>) : List<Long>

    @Query("SELECT * FROM post")
    suspend fun getPosts(): List<PostModel>

    @Query("DELETE FROM post")
    suspend fun clearCachedPosts(): Int
}