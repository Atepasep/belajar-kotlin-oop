package com.atepsaprudin.belajar.app

import com.atepsaprudin.belajar.data.Person

fun main() {
    val eko = Person()
    eko.firstName = "Atep"
    eko.middleName = "Saprudin"
    eko.lastName = "Yanwar"

    eko.sayHello("eko")
    eko.run()

    val fullname = eko.getFullName()
    println(fullname)
}