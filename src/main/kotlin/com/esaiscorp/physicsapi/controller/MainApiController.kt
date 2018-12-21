package com.esaiscorp.physicsapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class MainApiController {
    abstract class Math {
        abstract var result: Int
    }

    @GetMapping
    fun index(): String {
        return "This is API"
    }

    @GetMapping("/plus")
    fun plus(
            @RequestParam("num1") num1: Int,
            @RequestParam("num2") num2: Int
    ): Any {
        data class Plus(
                override var result: Int
        ) : Math()

        return Plus(
                result = num1 + num2
        )
    }

    @GetMapping("/minus")
    fun minus(
            @RequestParam("num1") num1: Int,
            @RequestParam("num2") num2: Int
    ): Any {
        data class Minus(
                override var result: Int
        ) : Math()

        return Minus(
                result = num1 - num2
        )
    }
}