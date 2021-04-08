package com.moiz.restcalculator.model

data class CalculatorResponse(
    val calculatorType:String,
    val operand1: Int,
    val operand2: Int,
    val operation: String,
    val result: Int,

    )
