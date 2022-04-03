package com.kotlin.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "USER")
class UserModel(   var name: String,
                   var address: String,
                   @Id
                   @Column(name = "id", nullable = false)
                   var id: Long? = null
)



