package com.infoskillstechnology.doctorappclone.data.model

import com.infoskillstechnology.doctorappclone.data.db.User
import com.infoskillstechnology.doctorappclone.utils.AppConstants

object MapUtils {

    fun userDbToUserBean(user: User) = UserBean(
            userId = AppConstants.USER_ID,
            firstName = user.firstName,
            lastName = user.lastName,
            emailId = user.emailId,
            profileUrl = user.profileUrl,
            phoneNumber = user.phoneNumber,
            countryCode = user.countryCode,
            language = user.language,
            isOnline = user.isOnline,
            updateAt = user.updateAt,
            createAt = user.createAt
    )


    fun userBeanToUserDb(user: UserBean) = User(
            userId = AppConstants.USER_ID,
            firstName = user.firstName,
            lastName = user.lastName,
            emailId = user.emailId,
            profileUrl = user.profileUrl,
            phoneNumber = user.phoneNumber,
            countryCode = user.countryCode,
            language = user.language,
            isOnline = user.isOnline,
            updateAt = user.updateAt,
            createAt = user.createAt
    )

}