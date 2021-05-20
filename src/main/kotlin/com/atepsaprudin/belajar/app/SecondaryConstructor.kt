package com.atepsaprudin.belajar.app

import com.atepsaprudin.belajar.data.Address

fun main() {
    val address = Address("Jalan A","Jakarta")
    val addressx = Address("Jalan A", "jakarrta","Indonesia")

    println(address.city)
    println(addressx.country)
}