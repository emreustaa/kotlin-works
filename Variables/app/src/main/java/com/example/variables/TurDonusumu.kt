package com.example.variables

fun main() {
    var str = "40T"
    // 1. Yöntem: to int 40t uygun bir değer olmadığı için null değeri döndürür, bunu try catch sayesinde yakalayabiliriz..
/*
    try {
        val number = str.toInt()
        println(number)
    } catch (nfe: NumberFormatException) {
        println("Hata: $nfe")
    }*/

    // to int or null, tam sayi ya da null değer döndürmektedir kontrolünü yaparak işlemi gerçekleştirebiliriz..
/*

    val number = str.toIntOrNull();

    if (number != null) {
        println(number)
    } else {
        println("Değer null dönmektedir..")*/

    val number = str.toIntOrNull()

    number?.let {
        print("dönüşümdesorun yoktur")
    }
}