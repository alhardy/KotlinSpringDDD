package com.demo.springkotlin.configuration.injection

import com.demo.springkotlin.application.ProductCommandHandlers
import org.axonframework.eventhandling.EventBus
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CommandHandlers {
    @Autowired
    lateinit var eventBus: EventBus

    @Bean
    fun getProductCommandHandler(): ProductCommandHandlers {
        return ProductCommandHandlers(eventBus)
    }
}