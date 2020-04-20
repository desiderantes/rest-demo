package com.omnilatam.restdemo.model

import javax.persistence.*

@Entity(name="product")
data class Product (
        @field:Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id : Long?,
        @Column(nullable = false)
        var name : String,
        @Column(nullable = false)
        var description: String,
        @ManyToOne
        @JoinColumn(name="userId")
        var user : User
) {

        @ManyToMany
        @JoinTable(
                name = "categoryProduct",
                joinColumns = [JoinColumn(name = "productId")],
                inverseJoinColumns = [JoinColumn(name = "categoryId")]
        )
        var categories : Set<Category> = emptySet()
}