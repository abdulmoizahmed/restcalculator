package com.moiz.restcalculator.service

import com.moiz.restcalculator.model.CalculatorResponse
import com.moiz.restcalculator.model.CalculatorType
import com.moiz.restcalculator.model.Operations
import org.springframework.stereotype.Service


@Service
class CalculatorServiceImpl: CalculatorService{

    override fun calculate(operand1: Int, operand2: Int, operation: Operations): CalculatorResponse? {

        return when {
            operation == Operations.ADD -> CalculatorResponse(
                CalculatorType.NORMAL.name,
                operand1,
                operand2,
                operation.name,
                operand1 + operand2)

            operation == Operations.SUB -> CalculatorResponse(
                CalculatorType.NORMAL.name,
                operand1,
                operand2,
                operation.name,
                operand1 - operand2)

            operation == Operations.MUL -> CalculatorResponse(
                CalculatorType.NORMAL.name,
                operand1,
                operand2,
                operation.name,
                operand1 * operand2)

            operation == Operations.DIV -> CalculatorResponse(
                CalculatorType.NORMAL.name,
                operand1,
                operand2,
                operation.name,
                operand1 / operand2)

            else -> null;
        }
    }
}