package com.example.WebDemo.service

import org.springframework.stereotype.Service

@Service
class HelloService {
    fun getHello(): String {
        return "hello kotlin from service"
    }
}