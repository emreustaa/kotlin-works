package com.example.nesneyeynelikprogramlama.araba

fun main() {

    var araba = Araba("kirmizi", 100, true)
    println(araba.renk)
    println(araba.hiz)
    println(araba.calisiyorMu)

    //yeni deger atama

    araba.renk = "mavi"
    araba.hiz = 120
    araba.calisiyorMu = false

    println("yeni kapasite bilgileri")
    println(araba.renk)
    println(araba.hiz)
    println(araba.calisiyorMu)

    araba.durdur()
    araba.bilgiAl()

    araba.calistir()
    araba.bilgiAl()

    araba.hizlan(50)
    araba.bilgiAl()


    araba.arabaRengiDegistir("sari")

    val toplamFiyat = araba.fiyatTopla(100, 2100, 300, 400)
    println("Girilen sayıların toplamı = $toplamFiyat")

    //Extension fonksiyon

    fun Int.carpi(sayi: Int): Int {

        return this * sayi
    }

    val deger = 5.carpi(5)
    println("Extension: $deger")

    //infix fonksiyon

    infix fun Int.topla(sayi2: Int): Int {

        return this + sayi2
    }

    val sonuc = 5 topla 4

    println("Infix : $sonuc")


}

