package com.mblydenburgh.teatime.controller

import com.mblydenburgh.teatime.service.TeaService
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

//@Service
@RestController
class Uicontroller(val teaService: TeaService) {

    @GetMapping("/")
    fun hello():String{
        return "hello"
    }

    @GetMapping("/api/tea")
    fun fetchTeas():String{
        return teaService.getTeas()
    }
}