package com.mblydenburgh.teatime.service

import org.springframework.stereotype.Service
import java.net.URL

@Service
class TeaService{
    fun getTeas():String{
        val result = URL("http://www.google.com").readText()
        println(result)
        return result
    }
}