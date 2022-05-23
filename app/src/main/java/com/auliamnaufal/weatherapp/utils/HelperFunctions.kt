package com.auliamnaufal.weatherapp.utils

import java.math.RoundingMode

object HelperFunctions {

    fun formatterDegree(temp: Double?) : String {
        val tempToCelcius = temp?.minus(273.0)
        val formattedDegree = tempToCelcius?.toBigDecimal()?.setScale(2, RoundingMode.CEILING)
        return "$formattedDegree˚C"
    }
}