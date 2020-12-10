package com.example.nesneyeynelikprogramlama.kalitimornek

fun main() {

    val topkapiSarayi = Saray(20, 5)
    val bogazVilla = Villa(4, true)

    println(topkapiSarayi.kuleSayisi)
    println(topkapiSarayi.pencereSayisi)

    println("///////////")

    println(bogazVilla.garajVarmi)
    println(bogazVilla.pencereSayisi)

    if (topkapiSarayi is Saray) {
        println("evet saraydır")
    } else {
        println("hayır saray değildir")
    }


    val ev2: Ev = Saray(35, 4) // upcasting

    val saray1 = ev2 as Saray //downcasting


}