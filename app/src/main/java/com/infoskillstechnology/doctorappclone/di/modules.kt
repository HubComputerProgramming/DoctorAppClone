package com.infoskillstechnology.doctorappclone.di

import android.content.Context
import com.infoskillstechnology.doctorappclone.data.db.AppDatabase
import com.infoskillstechnology.doctorappclone.data.db.UserDao
import com.infoskillstechnology.doctorappclone.data.user.SessionManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext


@Module
@InstallIn(ApplicationComponent::class)
object AppModule{


    @Provides
    fun providerUserDao(@ApplicationContext context:Context) : UserDao {
        return AppDatabase.getInstance(context).userDao()
    }

    @Provides
    fun providerSessionManager(userDao: UserDao) = SessionManager(userDao)

}