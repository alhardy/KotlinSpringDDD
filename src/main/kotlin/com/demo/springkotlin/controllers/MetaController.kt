package com.demo.springkotlin.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MetaController {
    @GetMapping("/ready")
    fun ready(): String {
        return "Ready"
    }
}