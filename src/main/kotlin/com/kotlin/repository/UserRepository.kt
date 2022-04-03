package com.kotlin.repository

import com.kotlin.model.UserModel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<UserModel, Long> {
}