package com.example.WebDemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebDemoApplication

fun main(args: Array<String>) {
	runApplication<WebDemoApplication>(*args)
}
