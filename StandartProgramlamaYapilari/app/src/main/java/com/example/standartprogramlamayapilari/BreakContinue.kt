package com.example.standartprogramlamayapilari

fun main() {

    var index = 0

    while (index < 5) {
        if (index == 3) {
            break
        }
        index++
        println("Sonuç $index")
    }

    println("--------------------------")

    for (index in 0..5) {
        if (index == 3) {
            continue
        }

        println("Sonuç $index")
    }

}