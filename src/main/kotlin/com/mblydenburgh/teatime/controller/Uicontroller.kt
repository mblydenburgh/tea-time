package com.mblydenburgh.teatime.controller

import com.mblydenburgh.teatime.dto.TeaDto
import com.mblydenburgh.teatime.service.TeaService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Uicontroller(val teaService: TeaService) {

    @GetMapping("/")
    fun hello():String{
        return "hello"
    }

    @GetMapping("/api/tea")
    fun fetchTeas():List<TeaDto>{
        return teaService.returnTeasFromDatabase()
    }
}