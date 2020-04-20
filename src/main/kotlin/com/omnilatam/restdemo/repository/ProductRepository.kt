package com.omnilatam.restdemo.repository

import com.omnilatam.restdemo.model.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface ProductRepository : JpaRepository<Product, Long>, CrudRepository<Product, Long> {

    fun findAllByUserId(userId: Long): List<Product>

    @Modifying(clearAutomatically = true)
    @Query("UPDATE product p SET p.name = :name, p.description = :description WHERE p.id = :id")
    fun updateNameDescription(name: String, description: String, id:Long): Int
}