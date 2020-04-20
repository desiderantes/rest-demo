package com.omnilatam.restdemo.repository

import com.omnilatam.restdemo.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface UserRepository : JpaRepository<User, Long>, CrudRepository<User, Long> {
    @Query("UPDATE user u SET u.name = :name, u.email = :email WHERE u.id = :id")
    @Modifying(clearAutomatically = true)
    fun updateUserNameEmail(name: String, email: String, id: Long): Int
}