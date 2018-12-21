package com.esaiscorp.physicsapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class MainApiController {

    @GetMapping
    fun index(): String {
        return "This is API"
    }
}