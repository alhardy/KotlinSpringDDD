package com.demo.springkotlin.configuration.injection

import com.demo.springkotlin.application.ProductCommandHandlers
import com.demo.springkotlin.domain.ProductRepository
import org.axonframework.eventhandling.EventBus
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CommandHandlers {
    @Autowired
    lateinit var productRepository: ProductRepository

    @Qualifier("eventBus")
    @Autowired
    lateinit var eventBus: EventBus

    @Bean
    fun getProductCommandHandler(): ProductCommandHandlers {
        return ProductCommandHandlers(productRepository, eventBus)
    }
}