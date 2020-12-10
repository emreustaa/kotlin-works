package com.example.standartprogramlamayapilari

import kotlin.math.*
import kotlin.random.Random

fun main() {
    val random = Random.nextInt(0, 10)
    println("Random sayi: $random")
    val yukari = ceil(5.8) //yukarı yuvarlama
    println("yukarı yuvarlama $yukari")

    val asagi = floor(5.8) //asagi yuvarlama
    println("asagi yuvarlama $asagi")

    val sqrt = sqrt(64.0)
    println("karakök $sqrt")

    val abs = abs(-64)
    println("mutlak $abs")

    val mx = max(100, 200)
    println("max $mx")

    val mn = min(0, 64)
    println("min $mn")

    val pw = 2.0.pow(3)
    println("kuvvet alma $pw")
}