package com.example.nesneyeynelikprogramlama.collections


fun main() {
    val dizi2: ArrayList<Int> = ArrayList<Int>()
    val meyveler = ArrayList<String>() // tanımlama1

    meyveler.add("çilek")
    meyveler.add("muz")
    meyveler.add("portakal")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")

    var str = meyveler.get(2)

    println(meyveler)
    println("----------------------")
    println(meyveler[4])

    meyveler[2] = "Ananas"
    println("----------------------")
    println(meyveler)

    meyveler.add(4,"Mandalina")
    println("----------------------")
    println(meyveler)
}