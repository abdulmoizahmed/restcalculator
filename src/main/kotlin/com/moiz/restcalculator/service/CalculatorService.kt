package com.moiz.restcalculator.service

import com.moiz.restcalculator.model.CalculatorResponse
import com.moiz.restcalculator.model.Operations
import org.springframework.stereotype.Service


interface CalculatorService {

    fun calculate(operand1:Int,operand2:Int,operation: Operations) : CalculatorResponse?

}