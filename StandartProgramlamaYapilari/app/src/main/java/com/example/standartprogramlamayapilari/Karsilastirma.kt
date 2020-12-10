package com.example.standartprogramlamayapilari

import java.util.*

fun main() {
    println("Merhaba")

/*
    // kısa if
    var a = 20
    var b = 20
    if (a == b) println("Sayılar eşittir") else println("sayılar eşit değildir")

    //when yapısı -> switch yapısının kotlindeki hali
*/
    var girilecek = Scanner(System.`in`)
    println("Bir sayı giriniz : ")
    var sayi: Int = girilecek.nextInt()


    when (sayi) {

        0 -> println("Sayı 0'dır")
        1 -> println("Sayı 1'dir")
        else -> {
            print("sayı her ikiside değildir..")
        }
    }

}