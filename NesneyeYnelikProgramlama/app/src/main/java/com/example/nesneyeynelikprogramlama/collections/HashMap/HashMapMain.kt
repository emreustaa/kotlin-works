package com.example.nesneyeynelikprogramlama.collections.HashMap

fun main() {
    val sayilar = mapOf<Int, String>(1 to "Bir", 2 to "İki") // üzerinde sadece okuma yapılabilir.
    val oranlar = mutableMapOf(1.5 to "Oran1", 3.4 to "Oran2") //hem okuma hem değişiklik
    val iller = HashMap<Int, String>() // hem okuma hem değişiklik yapılabilir

    iller.put(16, "Bursa")
    iller.put(34, "İstanbul")
    iller.put(6, "Ankara")

    println(iller.toString())

    iller.put(16, "Yeni Bursa")
    println(iller)

    println(iller.get(34))
    println(iller.size)
    println(iller.count())
    println(iller.isEmpty())
    println(iller.containsKey(16))
    println(iller.containsKey("Ankara"))

    for ((anahtar, deger) in iller) {
        println("Plaka Kodu: $anahtar İl İsmi: $deger")
    }

    iller.remove(6)
    println(iller)

    iller.clear()
    println(iller)
}