package com.care_me.CareMe.repository

import com.care_me.CareMe.database.dao.UserDAO
import com.care_me.CareMe.model.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val userDAO: UserDAO
) {

    suspend fun getUsers(): List<User> = withContext(Dispatchers.Main) {
        userDAO.getUsers()
    }

    suspend fun setUser(user: User) {
        return withContext(Dispatchers.Main) {
            userDAO.setUser(user)
        }
    }
}