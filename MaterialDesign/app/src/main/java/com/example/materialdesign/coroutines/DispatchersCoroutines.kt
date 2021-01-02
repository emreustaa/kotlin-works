package com.example.materialdesign.coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    //Dispatchers

    // Dispatcher.Default -> CPU Intensive işlerde kullanılıyor, örneğin görsel izleme, çok uzun diziyi dizme (1000'lik vs.)
    // Dispatchers.IO -> Input/Output, Networking Retrofit vs
    // Dispatchers.Main -> UI
    // Dispatchers.Unconfined-> Inherited dispatcher içerisinde çalıştırılan yere göre değiştiriliyor


    runBlocking {

        launch(Dispatchers.Main) {
            println("Main Thread ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO) {
            println("IO Thread ${java.lang.Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            println("Default Thread ${java.lang.Thread.currentThread().name}")
        }

        launch(Dispatchers.Unconfined) {
            println("Unconfined Thread ${java.lang.Thread.currentThread().name}")
        }
    }
}