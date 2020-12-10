package com.example.nesneyeynelikprogramlama.collections

fun main() {
    val meyveler = ArrayList<String>() // tanımlama1

    meyveler.add("çilek")
    meyveler.add("muz")
    meyveler.add("portakal")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")


    for (meyve in meyveler) {
        println("Meyve: ${meyve}")
    }

    for ((index, meyve) in meyveler.withIndex()) {
        println("$index. meyve: $meyve")
    }

}