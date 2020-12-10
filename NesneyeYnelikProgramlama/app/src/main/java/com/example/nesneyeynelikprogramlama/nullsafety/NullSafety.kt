package com.example.nesneyeynelikprogramlama

import java.util.*

fun main() {
/*
    lateinit var araba: Araba
    var str1: String? = null*/
    //println(str1!!.trim())


    var isimler = arrayOf<String>()
    var girdi = Scanner(System.`in`)
    for (i in 0 until isimler.count()) { //Dongu ının ıcerısınde 0'dan baslıcak until sag tarafına yazılanın bır eksıgıne kadar gıdıyo
        println("${i + 1}. isim giriniz")
        val isim = girdi.next()
        isimler[i] = isim
    }
    for ((indeks, isim) in isimler.withIndex()) {
        println("${indeks + 1}. isim : $isim")
    }
}