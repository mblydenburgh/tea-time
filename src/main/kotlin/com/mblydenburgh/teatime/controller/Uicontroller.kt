package com.mblydenburgh.teatime.controller

import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

//@Service
@RestController
class Uicontroller {

    @GetMapping("/")
    fun hello():String{
        return "hello"
    }
}