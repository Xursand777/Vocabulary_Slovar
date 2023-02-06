package com.x7.vocabulary_slovar.Room

import androidx.room.*
import com.x7.vocabulary_slovar.Room.Constants.TABLE_NAME

@Dao
interface UserDao {
    @Query("SELECT * FROM $TABLE_NAME")
    fun getAllUsers(): List<User>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: User)

    @Update
    fun updateUser(user: User)

    @Delete
    fun deleteUser(user: User)

    @Query("DELETE FROM $TABLE_NAME")
    fun deleteAllUsers()

    @Query("SELECT * FROM $TABLE_NAME WHERE id=:idd ")
    fun loadbyid(idd: Int): User

}