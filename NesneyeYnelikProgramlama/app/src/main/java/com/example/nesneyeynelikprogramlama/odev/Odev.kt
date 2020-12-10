package com.example.nesneyeynelikprogramlama.odev

class Odev {

    fun degToFah(derece: Double): Double {

        var fah: Double

        fah = (derece * 1.8) + 32
        return fah
    }

    fun letterCount(kelime: String, harf: Char) {

        var count: Int = 0

        for (k in kelime) {
            if (k == harf) {
                count++

            }
        }

        println("$kelime kelimesinde $harf harfinden $count adet bulunmaktadır.")
    }
}