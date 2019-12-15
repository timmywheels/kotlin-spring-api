package com.timwheeler.kotlinspringapi.controllers

import com.timwheeler.kotlinspringapi.models.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class UserController {
    val counter = AtomicLong()

    @GetMapping("/users")
    fun users(@RequestParam(value = "id") id: String, @RequestParam(value = "email") email: String) {
        User(counter.incrementAndGet(), email)
    }
}