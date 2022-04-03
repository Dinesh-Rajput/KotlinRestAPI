package com.kotlin.controller

import com.kotlin.model.UserModel
import com.kotlin.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val userService: UserService) {

    @GetMapping("/getUsers")
    fun getUsers(): MutableIterable<UserModel> {
        return userService.getUsers()
    }
}