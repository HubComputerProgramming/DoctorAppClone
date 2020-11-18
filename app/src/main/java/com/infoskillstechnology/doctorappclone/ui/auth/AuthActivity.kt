package com.infoskillstechnology.doctorappclone.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.activity.viewModels
import androidx.navigation.findNavController
import com.google.firebase.Timestamp
import com.infoskillstechnology.doctorappclone.R
import com.infoskillstechnology.doctorappclone.data.model.UserBean
import com.infoskillstechnology.doctorappclone.utils.AppConstants
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class AuthActivity : AppCompatActivity() {


    val authViewModel: AuthViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        // Dummpy data add

        val userBean = UserBean(
                userId = AppConstants.USER_ID,
                firstName ="Dream",
                lastName = "Programming",
                emailId = "skbhati@gmail.com",
                profileUrl = "",
                phoneNumber = "9810218672",
                countryCode = "+91",
                language = "English",
                isOnline = true,
                updateAt = "",
                createAt = ""
        )

        authViewModel.addUser(userBean)

        val navController = findNavController(R.id.nav_host_fragment_in_auth)




        Handler().postDelayed({
            navController.navigate(R.id.action_splashFragment_to_introFragment)
        },3000)
    }
}