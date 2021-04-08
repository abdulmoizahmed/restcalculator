package com.moiz.restcalculator.controller

import com.moiz.restcalculator.model.CalculatorResponse
import com.moiz.restcalculator.model.Operations
import com.moiz.restcalculator.service.CalculatorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody


@Controller
class RestController {

    @Autowired
    lateinit var calculatorService: CalculatorService

    @GetMapping("/calculate")
    @ResponseBody
    fun getTracking(
        @RequestParam(required = true) a: Int,
        @RequestParam(required = true) b: Int,
        @RequestParam(required = true) operation: Operations,

    ): CalculatorResponse? {
        return calculatorService.calculate(a,b,operation)
    }






}