package com.infoskillstechnology.doctorappclone.data.model


data class UserBean(
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