package com.omnilatam.restdemo.model

import javax.persistence.*

@Entity(name="user")
data class User (
        @field:Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id : Long?,
        @Column(nullable = false)
        var name: String,
        @Column(nullable = false)
        var email: String
){
        @OneToMany(mappedBy = "user")
        var products: Set<Product> = emptySet()
}
