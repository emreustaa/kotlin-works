package com.example.standartprogramlamayapilari


fun main() {

    var numbers = Array<Int>(5) { 0 }

    var sayilar = arrayOf<Int>(1, 2, 3, 4, 5) // genel kullanım hali budur
    var karisik = arrayOf(1, 2, "arda")


    var meyveler = arrayOf("elma", "armut", "mandalina")

    for (meyve in meyveler) {
        println("meyveler $meyve")
    }

    meyveler[1] = "portakal"

    println("değişmiş hali ${meyveler.contentToString()}")


    // array işlemleri

    println(meyveler.isEmpty())
    println(meyveler.count())
    println(meyveler.first())
    println(meyveler.last())
    println(meyveler.indexOf("elma"))
    println(meyveler.contains("elma"))
    println(meyveler.max())
    println(meyveler.min())
    println(meyveler.sort())
    println("sıralanmış hali ${meyveler.contentToString()}")
    println(meyveler.reverse())
    println("terse çevrilmiş hali ${meyveler.contentToString()}")


    println("-------------------------------------------")
    for ((index, meyve) in meyveler.withIndex()) {
        println("$index. indexte $meyve meyvesi vardır")
    }

}