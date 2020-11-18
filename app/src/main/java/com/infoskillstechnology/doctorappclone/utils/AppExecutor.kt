package com.infoskillstechnology.doctorappclone.utils

import java.util.concurrent.Executor
import java.util.concurrent.Executors

class AppExecutor(diskIO:Executor,uiThread:Executor) {


    companion object {
        @Volatile
        private var INSTANCE : AppExecutor? =null



    }

}