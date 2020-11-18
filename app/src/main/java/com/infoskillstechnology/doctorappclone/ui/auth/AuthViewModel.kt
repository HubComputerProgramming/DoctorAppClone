package com.infoskillstechnology.doctorappclone.ui.auth

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.infoskillstechnology.doctorappclone.data.model.UserBean
import com.infoskillstechnology.doctorappclone.data.user.SessionManager

class AuthViewModel
    @ViewModelInject constructor(
            var sessionManager:SessionManager,
            @Assisted val savedStateHandle: SavedStateHandle
    )
    : ViewModel() {


    fun addUser(userBean: UserBean){
        sessionManager.addUser(userBean)
    }



}