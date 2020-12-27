package com.example.materialdesign.storage

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialdesign.databinding.ActivityInternalExternalStorageBinding
import java.io.*

class InternalExternalStorage : AppCompatActivity() {
    private lateinit var binding: ActivityInternalExternalStorageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInternalExternalStorageBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonYaz.setOnClickListener {
            //hariciYaz()
            dahiliYaz()
        }

        binding.buttonOku.setOnClickListener {
            //hariciOku()
            dahiliOku()
        }

        binding.buttonSil.setOnClickListener {
            //hariciSil()
            dahiliSil()
        }
    }

    fun hariciYaz() {

        try {
            val yol = applicationContext.getExternalFilesDir(null)?.absolutePath
            val dosya = File(yol, "dosyam.txt")

            if (!dosya.exists()) {
                dosya.createNewFile()
            }

            val fw = FileWriter(dosya)
            val yazici = BufferedWriter(fw)

            yazici.write(binding.editTextGirdi.text.toString())

            yazici.flush() //yazma işlemi sırasında bir hata olursa kalan yazma işlemi tamamlıyor ve bu şekilde veri kaybını önlüyor
            yazici.close()
            fw.close()

            binding.editTextGirdi.setText("")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun hariciOku() {
        try {
            val yol = applicationContext.getExternalFilesDir(null)?.absolutePath
            val dosya = File(yol, "dosyam.txt")

            val fr = FileReader(dosya)
            var okuyucu = BufferedReader(fr)

            val sb = StringBuilder()
            var satir: String? = null


            while ({ satir = okuyucu.readLine();satir }() != null) {
                sb.append(satir + "\n")
            }

            okuyucu.close()
            binding.editTextGirdi.setText(sb.toString())

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun hariciSil() {
        val yol = applicationContext.getExternalFilesDir(null)?.absolutePath
        val dosya = File(yol, "dosyam.txt")

        dosya.delete()
    }

    fun dahiliYaz() {
        val fo = openFileOutput("dosyam.txt", Context.MODE_PRIVATE)
        val yazici = OutputStreamWriter(fo)
        yazici.write(binding.editTextGirdi.text.toString())

        yazici.close()

        binding.editTextGirdi.setText("")
        try {

        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun dahiliOku() {
        try {

            val fi = openFileInput("dosyam.txt")

            val isr = InputStreamReader(fi)

            val okuyucu = BufferedReader(isr)

            val sb = StringBuilder()
            var satir: String? = null

            while ({ satir = okuyucu.readLine();satir }() != null) {
                sb.append(satir + "\n")
            }

            okuyucu.close()
            binding.editTextGirdi.setText(sb.toString())
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun dahiliSil() {
        val dir = filesDir
        val dosya = File(dir, "dosyam.txt")
        dosya.delete()
    }
}