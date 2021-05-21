package com.atepsaprudin.belajar.app

import com.atepsaprudin.belajar.data.User

fun main() {
    val user1 = User("atep","rahasia")
    val user2 = User("asep","rahasia2")

    user1.username = "cekatep"
    user1.password = "rahasia3"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
}