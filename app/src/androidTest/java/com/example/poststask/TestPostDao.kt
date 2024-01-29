package com.example.poststask

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.poststask.data.local.AppDatabase
import com.example.poststask.data.local.PostDao
import com.example.poststask.data.model.PostModel
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException



@RunWith(AndroidJUnit4::class)
class TestPostDao {
    private lateinit var postDao: PostDao
    private lateinit var db: AppDatabase

    @Before
    fun createDb() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(
            context, AppDatabase::class.java).allowMainThreadQueries().build()
        postDao = db.postDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        db.close()
    }


    @Test
    fun insert_Post_And_Read_It_From_The_List() = runBlocking {
        val post =  PostModel(title = "title", body = "body", id = 100)
        postDao.addPost(post)
        assert(postDao.getPosts().contains(post))
    }

    @Test
    fun insert_List_Of_Posts_And_Read_It_From_The_List() = runBlocking {

        val postsList = listOf(PostModel(title = "title", body = "body", id = 2),
            PostModel(title = "title2", body = "body2", id =3 ))
        postDao.addPosts(postsList)
        assert(postDao.getPosts().containsAll(postsList))
    }


    @Test
    fun clear_Table() = runBlocking {
        postDao.clearCachedPosts()
        assert(postDao.getPosts().isEmpty())
    }

    @Test
    fun test_Conflict_Add_Two_Item_With_The_Same_Id(): Unit = runBlocking{
        val posts = listOf(PostModel(title = "title1", id = 1),
            PostModel(title = "title2",id = 1))

        postDao.addPosts(posts)
        postDao.getPosts().let{
            assert(!it.contains(posts[0]))
            assert(it.contains(posts[1]))
        }
    }
}