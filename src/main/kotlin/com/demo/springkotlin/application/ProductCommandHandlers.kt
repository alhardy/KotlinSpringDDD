package com.demo.springkotlin.application

import com.demo.springkotlin.application.commands.AddProductCommand
import com.demo.springkotlin.domain.NewProductCreated
import com.demo.springkotlin.domain.ProductAggregate
import com.demo.springkotlin.domain.ProductRepository
import org.axonframework.commandhandling.CommandHandler
import org.axonframework.eventhandling.EventBus
import org.axonframework.eventhandling.GenericEventMessage
import java.util.*

open class ProductCommandHandlers(
        private val productRepository: ProductRepository,
        private val eventBus: EventBus) {
    @CommandHandler
    fun addProduct(command: AddProductCommand): UUID {
        val productId = UUID.randomUUID()

        val product = ProductAggregate(productId, command.name, command.description)
        productRepository.save(product)

        eventBus.publish(GenericEventMessage.asEventMessage<NewProductCreated>(NewProductCreated(productId)))

        return productId
    }
}