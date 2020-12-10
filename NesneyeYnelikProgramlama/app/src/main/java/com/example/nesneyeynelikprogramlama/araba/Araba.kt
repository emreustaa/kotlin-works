package com.example.nesneyeynelikprogramlama.araba

class Araba(var renk: String, var hiz: Int, var calisiyorMu: Boolean) {

    fun bilgiAl() {

        println("Arabanın rengi $renk, Arabanın hızı $hiz, Araba çalışıyor mu : $calisiyorMu")
    }

    fun calistir() {

        calisiyorMu = true
    }

    fun durdur() {
        calisiyorMu = false
    }

    fun hizlan(kacKm: Int) {
        hiz += kacKm
    }

    fun arabaRengiDegistir(yeniRenk: String): String {

        println("Arabanın eski rengi: $renk ")
        renk = yeniRenk
        println("Arabanın yeni rengi: $renk ")
        return renk
    }

     fun fiyatTopla(vararg sayilar: Int):Int {

        var toplam = 0
        for (s in sayilar) {
            toplam += s
        }
        return toplam
    }



}

