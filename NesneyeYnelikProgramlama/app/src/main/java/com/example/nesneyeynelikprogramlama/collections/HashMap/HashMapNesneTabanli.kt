package com.example.nesneyeynelikprogramlama.collections.HashMap

import com.example.nesneyeynelikprogramlama.collections.ArrayListFiltreleme.Ogrenci

fun main() {

    var o1 = Ogrenci(1, "Emre", "12A")
    var o2 = Ogrenci(2, "Arda", "7E")
    var o3 = Ogrenci(3, "Tuğfe", "12E")
    var o4 = Ogrenci(1, "Demo", "12A")

    val ogrenciler = HashMap<Int, Ogrenci>()

    ogrenciler.put(o1.no, o1)
    ogrenciler.put(o2.no, o2)
    ogrenciler.put(o3.no, o3)
    ogrenciler.put(o4.no, o4)

    for ((ogrenciNo, nesne) in ogrenciler) {
        println("***************")
        println("Öğrenci No: $ogrenciNo")
        println("Öğrenci Adı: ${nesne.adi}")
    }
}