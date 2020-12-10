package com.example.nesneyeynelikprogramlama.collections.ArrayListFiltreleme

class Ogrenci(var no: Int, var adi: String, var sinif: String) {

    // no ya göre kayıt yapıp yapmamasının kararının verilmesi için yazılan kod
    override fun hashCode(): Int {
        return this.no
    }

    override fun equals(other: Any?): Boolean {
        if (this.no == (other as Ogrenci).no) {
            return true
        } else {
            return false
        }
    }
}