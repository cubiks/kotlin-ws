package com.playground.examples

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping(value = "/hello")
    fun sayHello(): String {
        return "hello world!"
    }
}