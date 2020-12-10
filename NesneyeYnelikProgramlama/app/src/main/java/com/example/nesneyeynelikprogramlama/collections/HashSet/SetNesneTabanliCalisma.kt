package com.example.nesneyeynelikprogramlama.collections.HashSet

import com.example.nesneyeynelikprogramlama.collections.ArrayListFiltreleme.Ogrenci

fun main() {
    val o1 = Ogrenci(1, "Ahmet", "11F")
    val o2 = Ogrenci(2, "Zeynep", "2A")
    val o3 = Ogrenci(3, "Arda", "9Z")


    val ogrenciler = HashSet<Ogrenci>()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o3)

    for (o in ogrenciler) {
        println("Ogrenci No : ${o.no} - Ogrenci Adi: ${o.adi} - Ogrenci Sınıfı ${o.sinif}")
    }

}