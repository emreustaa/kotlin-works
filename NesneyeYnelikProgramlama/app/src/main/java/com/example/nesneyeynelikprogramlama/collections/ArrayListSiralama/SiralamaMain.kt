package com.example.nesneyeynelikprogramlama.collections.ArrayListSiralama

fun main() {

    var k1 = Kisiler(1, "Emre")
    var k2 = Kisiler(2, "Tuğfe")
    var k3 = Kisiler(3, "Arda")

    val kisilerArrayList = ArrayList<Kisiler>()

    kisilerArrayList.add(k1)
    kisilerArrayList.add(k2)
    kisilerArrayList.add(k3)

    println("önce")
    for (kisi in kisilerArrayList) {

        println("${kisi.kisiNo} - ${kisi.kisiAd}")
    }

    println("Sayısal Küçükten Büyüğe")

    var siralamaArrayList1 = kisilerArrayList.sortedWith(compareBy { it.kisiNo })

    for (kisi in siralamaArrayList1) {
        println("${kisi.kisiNo} - ${kisi.kisiAd}")
    }
    println("Sayısal Büyükten Küçüğe ")
    var siralamaArrayList2 = kisilerArrayList.sortedWith(compareByDescending { it.kisiNo })

    for (kisi in siralamaArrayList2) {
        println("${kisi.kisiNo} - ${kisi.kisiAd}")
    }

    println("Harfsel Büyükten Küçüğe ")

    var siralamaArrayList3 = kisilerArrayList.sortedWith(compareByDescending { it.kisiAd })

    for (kisi in siralamaArrayList3) {
        println("${kisi.kisiNo} - ${kisi.kisiAd}")
    }

}