package com.infoskillstechnology.doctorappclone.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "user")
data class User(
        @PrimaryKey(autoGenerate = false)
        val userId:Int = 1,
        val firstName:String,
        val lastName:String,
        val emailId:String,
        val profileUrl:String,
        val phoneNumber:String,
        val countryCode:String,
        val language:String,
        val isOnline:Boolean,
        val updateAt:String,
        val createAt:String
)