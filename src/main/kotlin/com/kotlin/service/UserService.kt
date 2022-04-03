package com.kotlin.service

import com.kotlin.model.UserModel

interface UserService {

    fun getUsers(): MutableIterable<UserModel>
}