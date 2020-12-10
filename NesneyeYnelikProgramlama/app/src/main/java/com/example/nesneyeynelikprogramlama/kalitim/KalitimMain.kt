package com.example.nesneyeynelikprogramlama.kalitim

fun main() {

    var araba = Araba("kirmizi", "manuel", "sedan")

    println(araba.renk)
    println(araba.kasaTipi)
    println(araba.vites)


    println("--------------")
    var nissan = Nissan("mavi", "otomatik", "hb", "micra")

    println(nissan.model)
    println(nissan.vites)
    println(nissan.kasaTipi)
    println(nissan.renk)

}