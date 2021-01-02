package com.example.materialdesign.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialdesign.databinding.ActivityCoroutinesUsingBinding
import kotlinx.coroutines.*

class CoroutinesUsing : AppCompatActivity() {
    private lateinit var binding: ActivityCoroutinesUsingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // uzun sürebilen işlemlerde (internet çekme işlemleri vs) kullanılan yapı
        // threadlere göre daha hafif iş yaparak ve az enerji harcar
        binding = ActivityCoroutinesUsingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Light Weightness
        // Threadlere göre daha verimlidir

        /*GlobalScope.launch {
            repeat(100000) {
                launch {
                    println("Android")

                }
            }
        }*/

        //Scope
        //GlobalScope, bütün uygulama kapsamında çalıştırabileceğimiz bir coroutin oluşturur.
        //runBlocking, coroutinler için scopelar oluşturur ama bloklayarak oluşturur. Sadece yapacağımız kodta tek işlem yapılıyorsa tek amaç coroutin çalıştırmaktsa kullanılır
        // Cororuine Scope -> içerisinde bütün coroutinler bitene kadar çalışmaya devam ediyoır.

        /*println("run blocking start")
        runBlocking {
            launch {
                delay(5000)
                println("run blocking")
            }
        }
        println("run blocking end")*/
        /*println("global scope start")
        GlobalScope.launch {

            delay(5000)
            println("global scope")
        }
        println("run blocking stop")*/

        //scope -> coroutinleri oluşturuyo ve yönetiyo

        //context -> hangi verilerle birlikte çalışacağını söylüyor, farklı threadler vs..
/*
        println("Coroutine Scope Start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("Coroutine Scope")
        }
        println("Coroutine Scope End")
*/


    }
}