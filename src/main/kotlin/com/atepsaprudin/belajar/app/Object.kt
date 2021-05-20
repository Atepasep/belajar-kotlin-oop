package com.atepsaprudin.belajar.app

import com.atepsaprudin.belajar.data.Person

fun main() {
    val atep = Person()
    atep.firstName = "Atep"
    val asep = Person()
    asep.firstName = "Asep"
    val tsabit = Person()
    tsabit.firstName = "Tsabit"

    println(atep.firstName)
    println(asep.firstName)
    println(tsabit.firstName)
}