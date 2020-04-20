package com.omnilatam.restdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
class RestDemoApplication

fun main(args: Array<String>) {
    runApplication<RestDemoApplication>(*args)
}
