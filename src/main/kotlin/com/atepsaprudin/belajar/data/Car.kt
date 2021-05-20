package com.atepsaprudin.belajar.data

class Car(brandParam: String, nameParam: String, yearParam: Int = 2021) {

    init {
        println("Mobil dibuat pada $yearParam")
    }

    constructor(brandParam: String, nameParam: String): this(brandParam, nameParam, 2021) {
        println("Secondary Constructor")
    }

    constructor(brandParam: String): this(brandParam,""){
        println("Secondary Secondary Constructor")
    }

    var brand: String = brandParam
    var name: String = nameParam
    var year: Int = yearParam
}