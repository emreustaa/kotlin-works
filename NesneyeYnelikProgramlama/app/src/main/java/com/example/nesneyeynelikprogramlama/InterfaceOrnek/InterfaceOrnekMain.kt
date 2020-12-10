package com.example.nesneyeynelikprogramlama.InterfaceOrnek

fun main() {

    val aslan = Aslan()

    var amasyaElmasi: Elma = AmasyaElmasi()

    var elma = Elma()

    val tavuk: Eatable = Tavuk()

    val nesneler = arrayOf(aslan, amasyaElmasi, elma, tavuk)

    for (nesne in nesneler){

        if(nesne is Eatable){
            nesne.howToEat()
        }

        if(nesne is Squeezable){
            nesne.howToSqueeze()
        }
    }
}