package com.example.nesneyeynelikprogramlama

import com.example.nesneyeynelikprogramlama.composition.Adres
import com.example.nesneyeynelikprogramlama.composition.Kisiler

fun main() {

    var adres = Adres("Bursa", "Osmangazi")

    var kisi = Kisiler("Ahmet", 18, adres);

    println("Kisi ad ${kisi.ad}")
    println("Kisi yas ${kisi.yas}")
    println("Kisi il ${kisi.adres.il}")
    println("Kisi ilce ${kisi.adres.ilce}")
}