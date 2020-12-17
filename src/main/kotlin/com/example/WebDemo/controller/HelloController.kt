package com.example.WebDemo.controller

import com.example.WebDemo.dto.HelloDto
import com.example.WebDemo.service.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(val helloService: HelloService) {
    @GetMapping("/hello")
    fun helloKotlin(): String {
        return "hello Kotlin"
    }

    @GetMapping("/hello-service")
    fun helloKotlinService(): String {
        return helloService.getHello()
    }

    @GetMapping("/hello-dto")
    fun helloDto(): HelloDto {
        return HelloDto("hello kotlin from dto")
    }
}