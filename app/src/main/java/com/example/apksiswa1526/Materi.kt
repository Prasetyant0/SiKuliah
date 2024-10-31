package com.example.apksiswa1526

import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Materi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.materi)

        val gv_materi:GridView = findViewById(R.id.gv_materi)

        var juduls:MutableList<String> = mutableListOf()
        juduls.add("Pengenalan Bahasa Kotlin Amikom")
        juduls.add("Pindah Halaman Dengan Intent")
        juduls.add("Menampilkan Data Statis")
        juduls.add("Menampilkan Data Dinamis")

        var namas:MutableList<String> = mutableListOf()
        namas.add("Arif Aminudin")
        namas.add("Bambang Pamungkas")
        namas.add("Cintya Dewi")
        namas.add("Doni Saputra")

        val perulangandata = Materi_item(this, juduls, namas)
        gv_materi.adapter = perulangandata
    }
}