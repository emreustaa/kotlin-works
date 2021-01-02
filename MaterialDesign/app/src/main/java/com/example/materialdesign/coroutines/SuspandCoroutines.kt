package com.example.materialdesign.coroutines

import kotlinx.coroutines.*


// Suspend Fonksiyonlar -> İstediğimiz zaman durdurulup çalıştırılabilir

fun main() {

    runBlocking {
        delay(2000)
        println("run blocking")
        myFunction()
    }
}

suspend fun myFunction() {

    coroutineScope {

        delay(4000)
        println("suspend function")
    }
}