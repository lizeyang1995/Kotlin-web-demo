package com.example.WebDemo.repository

import com.example.WebDemo.po.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: CrudRepository<User, Long> {
    fun findByLastName(name: String): User
}