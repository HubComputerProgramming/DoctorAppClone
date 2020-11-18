package com.infoskillstechnology.doctorappclone.data.user

import android.database.Observable
import androidx.lifecycle.Observer
import com.infoskillstechnology.doctorappclone.data.db.AppDatabase
import com.infoskillstechnology.doctorappclone.data.db.User
import com.infoskillstechnology.doctorappclone.data.db.UserDao
import com.infoskillstechnology.doctorappclone.data.model.MapUtils
import com.infoskillstechnology.doctorappclone.data.model.UserBean
import javax.inject.Inject

class SessionManager @Inject constructor(val userDao:UserDao) {

    fun addUser(userBean: UserBean){
        AppDatabase.executor.execute{
            userDao.insert(MapUtils.userBeanToUserDb(userBean))
        }
    }



}