package com.mblydenburgh.teatime

import com.mblydenburgh.teatime.service.TeaService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.mblydenburgh.teatime"])
class TeaTimeApplication(val service: TeaService){

}

fun main(args: Array<String>) {
    runApplication<TeaTimeApplication>(*args)
}
