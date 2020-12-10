package com.example.standartprogramlamayapilari

import kotlin.math.ln

fun main() {

    //for döngüsü
    for (i in 1..5) {
        println(i)
    }

    println("------------------------------")
    //belirlenen diziden elemanları okuma
    val dizi = listOf(10, 20, 30, 40)

    for (d in dizi) {
        println("Sonuç: $d")
    }

    //until dizilerdeki indeks değerini 1 azaltarak alır.

    val test = ArrayList<String>()

    test.add("Elma")
    test.add("armut")
    test.add("çilek")

    println("------------------------------")
    for (elements in 0 until test.size) {
        println("Elemanlar $elements")
    }
    println("------------------------------")
    for (index in 0..10 step 2) {
        println("Sayilar $index")
    }
    println("------------------------------")
    for (index in 10 downTo 0 step 2) {
        println("Sayilar $index")
    }

    println("------------------------------")

    // hem index hem de değerini alma
    val dizi2 = listOf(10, 20, 30, 40)

    for ((index, deger) in dizi2.withIndex()) {
        println("$index. indeksin degeri : $deger")
    }

    

}