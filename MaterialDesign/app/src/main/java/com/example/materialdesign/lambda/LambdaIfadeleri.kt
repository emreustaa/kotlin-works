package com.example.materialdesign.lambda

fun main() {


    // bir fonksiyonu tek bir satırda yazmak için kullanılır.
    printstring("my test string")

    val testString = { myString: String -> println(myString) }
    testString("My Lambda String")

    val multiplyLambda = { a: Int, b: Int -> a * b }
    println(multiplyLambda(3, 5))

    val multiplyLambda2: (Int, Int) -> Int = { a, b -> a * b }
    println(multiplyLambda2(5,5))
}


fun printstring(myString: String) {

    println(myString)
}

