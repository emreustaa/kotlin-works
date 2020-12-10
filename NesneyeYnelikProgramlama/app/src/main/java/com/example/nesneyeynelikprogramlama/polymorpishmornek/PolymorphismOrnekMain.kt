package com.example.nesneyeynelikprogramlama.polymorpishmornek

fun main() {

    val ogretmen1: Personel = Ogretmen()

    val isci: Personel = Isci()

    val mudur = Mudur()

//    mudur.iseAl(ogretmen1)
//    mudur.iseAl(isci)

    mudur.terifEttir(ogretmen1)
    mudur.terifEttir(isci)
}