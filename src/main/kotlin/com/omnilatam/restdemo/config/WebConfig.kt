package com.omnilatam.restdemo.config

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.webmvc.config.*
import org.springframework.data.rest.core.config.RepositoryRestConfiguration

@Configuration
class WebConfig {

    @Bean
    fun objectMapper () = jacksonObjectMapper().findAndRegisterModules()

}

@Configuration
class CustomizedRestMvcConfiguration : RepositoryRestConfigurer {
    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration) {
        config.setBasePath("/api/v1")
    }
}