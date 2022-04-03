package com.kotlin.service.impl

import com.kotlin.model.UserModel
import com.kotlin.repository.UserRepository
import com.kotlin.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl (private var repository: UserRepository) : UserService{

    override fun getUsers(): MutableIterable<UserModel> {
       return repository.findAll()
    }

}