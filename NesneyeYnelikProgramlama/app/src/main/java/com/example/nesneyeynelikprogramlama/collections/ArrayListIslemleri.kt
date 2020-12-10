package com.example.nesneyeynelikprogramlama.collections

fun main() {
    val meyveler = ArrayList<String>() // tanımlama1

    meyveler.add("çilek")
    meyveler.add("muz")
    meyveler.add("portakal")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")

    println(meyveler.isEmpty())
    println(meyveler.count()) // boyut
    println(meyveler.size) // boyut
    println(meyveler.first()) //ilk
    println(meyveler.last()) //son

    println(meyveler.contains("çilek"))
    println(meyveler.max())
    println(meyveler.min())
    println("reverse once $meyveler")
    meyveler.reverse()
    println("reverse sonra $meyveler")

    println("sort önce $meyveler")
    meyveler.sort()
    println("sort $meyveler")

    meyveler.removeAt(3)
    println("meyveler 3 silindi $meyveler")
    meyveler.remove("çilek")
    println("meyveler çilek silindi $meyveler")

    println(meyveler.joinToString())


    /*meyveler.clear()
    println("meyveler silindi $meyveler")*/
}