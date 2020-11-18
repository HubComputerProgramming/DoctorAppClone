package com.infoskillstechnology.doctorappclone.data.db

import androidx.room.*

@Dao
interface UserDao {

    @Query("SELECT * FROM user WHERE userId=:id")
    fun getUserById(id:Int) : User

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(user:User) : Long

    @Delete
    fun delete(user:User)

    @Query("DELETE FROM user WHERE userId=:id")
    fun deleteById(id:Int)

}