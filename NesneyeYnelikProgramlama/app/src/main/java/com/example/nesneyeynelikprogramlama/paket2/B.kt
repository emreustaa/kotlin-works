package com.example.nesneyeynelikprogramlama.paket2

import com.example.nesneyeynelikprogramlama.paket1.A

class B {

    fun fonksiyon() {

        var nesne = A()

        println(nesne.internalDegisken)
        println(nesne.varSayilanDegisken)
        println(nesne.publicDegisken)
    }


}

fun main() {

    var nesneB = B()

    println(nesneB.fonksiyon())
}