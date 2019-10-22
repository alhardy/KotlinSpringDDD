package com.demo.springkotlin.configuration.injection

import com.demo.springkotlin.domain.ProductRepository
import com.demo.springkotlin.infrastructure.repositories.ProductRepositoryImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Repositories {
    @Bean
    fun getProductRepository() : ProductRepository {
        return ProductRepositoryImpl()
    }
}