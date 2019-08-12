package com.web.controller

import org.springframework.boot.web.server.WebServerFactoryCustomizer
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory
import org.springframework.stereotype.Component

@Component
class CustomContainer : WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

    override fun customize(factory: ConfigurableServletWebServerFactory) {
        factory.setPort(8082)
        factory.setContextPath("")
    }
}