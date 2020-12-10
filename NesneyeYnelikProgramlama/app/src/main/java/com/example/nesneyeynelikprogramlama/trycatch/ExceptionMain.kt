package com.example.nesneyeynelikprogramlama.trycatch

import java.lang.Exception

fun main() {
    val x = 10
    val y = 0
    try {
        println("Sonuç ${x / y}")
    } catch (e: Exception) {
        println("Hata: $e")
    }
}