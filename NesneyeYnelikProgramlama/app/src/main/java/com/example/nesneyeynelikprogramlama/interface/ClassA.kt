package com.example.nesneyeynelikprogramlama.`interface`

class ClassA : Interface1 {

    override val degisken: Int = 10


    override fun metod1() {
        println("Interface Merhaba")
    }

    override fun metod2(): String {
        return "Interface çalışması"
    }
}