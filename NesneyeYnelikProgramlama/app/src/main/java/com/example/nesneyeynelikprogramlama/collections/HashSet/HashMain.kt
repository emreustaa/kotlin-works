package com.example.nesneyeynelikprogramlama.collections.HashSet

fun main() {
    val meyveler = setOf<String>(
        "Çilek",
        "Muz",
        "Elma",
        "Kivi"
    ) //üzerinde sadecce verileri okuyabildiğimiz yapı

    val iller = mutableSetOf<String>(
        "Bursa",
        "İstanbul",
        "Ankara",
        "İzmir"
    ) // veri okuyup değişiklik yapabildiğimiz yapı

    val sayilar = HashSet<Int>()

    sayilar.add(10)
    sayilar.add(20)
    sayilar.add(30)

    println(sayilar)

    sayilar.add(20)
    println(sayilar)

    println(sayilar.elementAt(1))
    println(sayilar.size)
    println(sayilar.count())
    println(sayilar.isEmpty())
    println(sayilar.contains(20))

    for (s in sayilar) {
        println(s)
    }

    for ((index, sayi) in sayilar.withIndex()) {
        println("$index. sayi : $sayi")
    }

    sayilar.remove(10)
    println(sayilar)

    sayilar.clear()
    println(sayilar)
}