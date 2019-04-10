package com.mblydenburgh.teatime

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.mblydenburgh.teatime"])
class TeaTimeApplication(){

}

	fun main(args: Array<String>) {
		runApplication<TeaTimeApplication>(*args)
	}
