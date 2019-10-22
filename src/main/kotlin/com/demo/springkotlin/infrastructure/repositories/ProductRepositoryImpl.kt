package com.demo.springkotlin.infrastructure.repositories

import com.demo.springkotlin.domain.ProductAggregate
import com.demo.springkotlin.domain.ProductRepository
import java.util.*

class ProductRepositoryImpl : ProductRepository {
    override fun findById(id: UUID): ProductAggregate {
        return ProductAggregate(id, "Product 1", "Product 1 Description")
    }

    override fun save(product: ProductAggregate) {
        // TODO
    }
}