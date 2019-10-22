package com.demo.springkotlin.domain

import java.util.*

interface ProductRepository {
    fun findById(id: UUID): ProductAggregate
    fun save(product: ProductAggregate)
}