package com.demo.springkotlin.application

import com.demo.springkotlin.application.commands.AddProductCommand
import org.axonframework.commandhandling.CommandHandler
import org.axonframework.eventhandling.EventBus
import java.util.*

open class ProductCommandHandlers(private val eventBus: EventBus) {
    @CommandHandler
    fun addProduct(command: AddProductCommand): UUID {
        val productId = UUID.randomUUID()

        // TODO: Save Product

        return productId
    }
}