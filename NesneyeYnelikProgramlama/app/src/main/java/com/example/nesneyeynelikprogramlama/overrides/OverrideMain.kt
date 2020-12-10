package com.example.nesneyeynelikprogramlama.overrides

fun main() {

    var hayvan = Hayvan()
    hayvan.sesCikar()

    var memeli = Memeli()
    memeli.sesCikar()


    var kedi = Kedi()
    kedi.sesCikar()

    var kopek = Kopek()
    kopek.sesCikar()

    var hayvan2: Hayvan = Kopek()

    println(hayvan2.sesCikar())


    var h: Hayvan = Kedi()
    println(h.sesCikar())


}