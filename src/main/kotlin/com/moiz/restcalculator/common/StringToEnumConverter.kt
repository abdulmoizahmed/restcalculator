package com.moiz.restcalculator.common


import com.moiz.restcalculator.model.Operations
import org.springframework.core.convert.converter.Converter

 class StringToEnumConverter : Converter<String?, Operations?> {

    override fun convert(source: String): Operations {
        return Operations.valueOf(source.toUpperCase())
    }

}