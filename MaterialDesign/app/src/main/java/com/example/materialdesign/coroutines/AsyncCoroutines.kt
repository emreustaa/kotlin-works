package com.example.materialdesign.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    var userName = ""
    var userAge = 0

    runBlocking {

        //async ->  bloklamadan işlemin tamamlanmasını bekler. Download name inmesini bekler sonra download age inmesini bekler ve sonrasında
        // atama işlemini yapar

        val downloadedName = async {
            downloadName()
        }

        val downloadedAge = async {
            downloadAge()
        }

        userName = downloadedName.await()
        userAge = downloadedAge.await()

        println("${userName} - ${userAge}")

    }
}

suspend fun downloadName(): String {

    delay(2000)
    val userName = "Emre: "
    println("username downlaod")
    return userName
}

suspend fun downloadAge(): Int {

    delay(4000)
    val userAge = 24
    println("userage download")
    return userAge
}