package com.example.weather.model.entites

data class Weather(
    val city: City = getDefaultCity(),
    val temperature: Int = 0,
    val feelsLike: Int = 0
)

fun getDefaultCity() = City("Berlin", 55.1111111, 99.4545454545)
