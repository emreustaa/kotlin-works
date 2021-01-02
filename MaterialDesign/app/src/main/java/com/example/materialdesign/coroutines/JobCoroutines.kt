package com.example.materialdesign.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    // Job -> iş döndürür ve döndürülen işleri biz sonradan kontrol edebiliriz.


    runBlocking {
        val myJob = launch {
            delay(2000)
            println("job")

            val secondJob = launch {
                println("job2")
            }
        }

        myJob.invokeOnCompletion {
            println("my job end")
        }
        myJob.cancel()
    }
}