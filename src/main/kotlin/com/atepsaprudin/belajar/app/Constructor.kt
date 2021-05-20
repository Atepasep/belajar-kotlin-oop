package com.atepsaprudin.belajar.app

import com.atepsaprudin.belajar.data.Car

fun main() {
    val avanza = Car("Toyota")
    avanza.year = 2018
    val almaz = Car("Wuling","Mobil")

    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)
}