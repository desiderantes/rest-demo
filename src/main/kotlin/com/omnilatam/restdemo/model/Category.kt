package com.omnilatam.restdemo.model

import javax.persistence.*

@Entity(name = "category")
data class Category(
        @field:Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long?,
        @Column(nullable = false)
        var name: String
) {
        @ManyToMany(mappedBy = "categories")
        var products : Set<Product> = emptySet()
}