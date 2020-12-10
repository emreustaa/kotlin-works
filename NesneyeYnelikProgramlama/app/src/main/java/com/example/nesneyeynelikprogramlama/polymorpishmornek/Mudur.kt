package com.example.nesneyeynelikprogramlama.polymorpishmornek

class Mudur : Personel() {

    fun iseAl(p: Personel) {
        p.iseAlindi()
    }

    fun terifEttir(p: Personel) {

        if (p is Ogretmen) {
            p.maasArttir()
        }
        if (p is Isci) {
            println("İşçilerin maaşı arttırılamaz..")
        }
    }
}