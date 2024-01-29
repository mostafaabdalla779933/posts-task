package com.example.poststask.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.poststask.data.model.PostModel

@Database(entities = [PostModel::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun postDao() : PostDao
}