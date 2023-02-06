package com.x7.vocabulary_slovar

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.x7.vocabulary_slovar.Room.AppDatabase
import com.x7.vocabulary_slovar.Room.Constants

object Roommmmm {


    fun getroom(context:Context):AppDatabase{
        val db:AppDatabase = Room.databaseBuilder(
            context,
            AppDatabase::class.java, "${Constants.TABLE_NAME}"
        ).allowMainThreadQueries().build()

        return db
    }
}