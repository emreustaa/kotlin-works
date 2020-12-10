package com.example.nesneyeynelikprogramlama.compositionornek

fun main() {

    var kategori = Kategoriler(1, "Dram")
    var kategori2 = Kategoriler(2, "Komedi")

    var yonetmen = Yonetmenler(1, "Nuri Bilge Ceylan")
    var yonetmen2 = Yonetmenler(2, "Quentin Tarantino")

    var film = Filmler(1, "Django", kategori, yonetmen2)
    var film2 = Filmler(1, "Django", kategori2, yonetmen)


    println("Film id: ${film.film_id}")
    println("Film ad: ${film.film_ad}")
    println("Film kategori id: ${film.kategori_id.kategori_id}")
    println("Film kategori ad: ${film.kategori_id.kategeori_ad}")
    println("Film yonetmen id: ${film.yonetmen_id.yonetmen_id}")
    println("Film yonetmen ad: ${film.yonetmen_id.yonetmen_ad}")

}