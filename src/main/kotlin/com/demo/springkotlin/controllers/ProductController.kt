package com.demo.springkotlin.controllers

import com.demo.springkotlin.models.AddProductRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class ProductController {
    @PostMapping("products")
    fun addProduct(@RequestBody request: AddProductRequest) : ResponseEntity<UUID> {
        val productId = UUID.randomUUID()

        return ResponseEntity(productId, HttpStatus.CREATED)
    }
}