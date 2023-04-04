package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class Idea316473Application {

	@GetMapping("hello")
	fun hello(): String = "Hello there!"

}

fun main(args: Array<String>) {
	runApplication<Idea316473Application>(*args)
}
