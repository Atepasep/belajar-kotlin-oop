package com.atepsaprudin.belajar.data

class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String){
        println("Hello $name my name is $firstName")
    }

    fun run(){
        println("i'm Run")
    }

    fun getFullName():String {
        return "$firstName $middleName $lastName"
    }
}