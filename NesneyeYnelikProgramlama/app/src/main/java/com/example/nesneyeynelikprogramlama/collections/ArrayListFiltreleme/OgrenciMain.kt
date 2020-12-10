package com.example.nesneyeynelikprogramlama.collections.ArrayListFiltreleme

fun main() {

    var o1 = Ogrenci(1, "Emre", "12A")
    var o2 = Ogrenci(2, "Arda", "7E")
    var o3 = Ogrenci(3, "Tuğfe", "12E")
    var o4 = Ogrenci(1, "Demo", "12A")
    var ogrenciler = ArrayList<Ogrenci>()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)


    println("önce")

    for (ogrenci in ogrenciler) {
        println("*************************")
        println("Öğrenci No ${ogrenci.no}")
        println("Öğrenci Adi ${ogrenci.adi}")
        println("Öğrenci Sinifi ${ogrenci.sinif}")
    }

    println("sonra")

    var sonucListe = ogrenciler.filter { it.no>2 }

    for (ogrenci in sonucListe) {
        println("*************************")
        println("Öğrenci No ${ogrenci.no}")
        println("Öğrenci Adi ${ogrenci.adi}")
        println("Öğrenci Sinifi ${ogrenci.sinif}")
    }
}