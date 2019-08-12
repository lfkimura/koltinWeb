package com.web.controller

import org.slf4j.LoggerFactory
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
// @RequestMapping(value = ["web"], produces = [MediaType.APPLICATION_JSON_VALUE])
class RequestInput {
    val logger = LoggerFactory.getLogger("controller")

    @GetMapping(value=["status"])
    fun status() = "Hello Kotlin!"

    @PostMapping(path = ["dev"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun validate(@RequestBody input: String): transactionResponse {

        val random = Math.random()
        logger.info("random value $random")
        logger.info(input)
        if (random > 0.1)
            return transactionResponse(true, "ASDFGHJKL", "success")
        else throw Exception()
    }
}

data class transactionResponse(val accepted: Boolean, val movementId: String, val message: String)

data class ResponseData(val id: String, val accepted: Boolean, val status: String)