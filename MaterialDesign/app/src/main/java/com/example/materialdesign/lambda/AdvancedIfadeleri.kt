package com.example.materialdesign.lambda

fun main() {
    //async : bir işlem uzun sürerken onun bitmesini beklemeyip diğer işlemlerinde yapılmasını sağlar.
    // callback function, listener function, completion function


    downloadMusicians("metallica.com", {
        println("Complted && ready")
    })


}

fun downloadMusicians(url: String, completion: () -> Unit) {

    // url -> download
    //data


    completion()
}