package com.example.WebDemo.controller

import com.example.WebDemo.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(val userRepository: UserRepository) {
    @GetMapping("/user")
    fun findAll() = userRepository.findAll()

    @GetMapping("/user/{name}")
    fun findByLastName(@PathVariable name: String) = userRepository.findByLastName(name)
}