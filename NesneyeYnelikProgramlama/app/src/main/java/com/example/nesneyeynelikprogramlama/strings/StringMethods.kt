package com.example.nesneyeynelikprogramlama.strings

fun main() {
    val str12 = "Merhaba"
    println(str12.subSequence(0, 3)) // 0'dan 3 kadar olan indisleri yazdırır

    val str13 = "Merhaba"
    if (str13.contains("er")) {
        println("$str13 er içermektedir.")
    }

    val str14 = "Merhaba"

    println(str14.toUpperCase())
    println(str14.toLowerCase())


    val str15 = "Merhaba Nasılsın"

    val str16 = str15.split(" ")
    //    println(str15.split(" "))

    for (s in str16) {
        println(s)
    }

    val str17 = " Merhaba "
    println(str17.trim())

}