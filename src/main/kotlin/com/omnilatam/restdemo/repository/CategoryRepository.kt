package com.omnilatam.restdemo.repository

import com.omnilatam.restdemo.model.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface CategoryRepository : JpaRepository<Category, Long>, CrudRepository<Category, Long> {
}