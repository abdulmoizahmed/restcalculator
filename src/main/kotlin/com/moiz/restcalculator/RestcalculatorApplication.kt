package com.moiz.restcalculator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@EnableWebMvc
@SpringBootApplication
class RestcalculatorApplication

fun main(args: Array<String>) {
	runApplication<RestcalculatorApplication>(*args)
}
