package com.demo.springkotlin.controllers

import com.demo.springkotlin.application.commands.AddProductCommand
import com.demo.springkotlin.models.AddProductRequest
import org.axonframework.commandhandling.gateway.CommandGateway
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class ProductController(val commandGateway: CommandGateway) {
    @PostMapping("products")
    fun addProduct(@RequestBody request: AddProductRequest) : ResponseEntity<UUID> {
        val command = AddProductCommand(request.name, request.description)
        val productId = commandGateway.sendAndWait<UUID>(command)

        return ResponseEntity(productId, HttpStatus.CREATED)
    }
}