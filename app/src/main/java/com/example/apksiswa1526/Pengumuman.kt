package com.example.apksiswa1526

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Pengumuman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.pengumuman)
        /* ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        } */

        //kita buat data juduls pengumuman
        var juduls:MutableList<String> = mutableListOf()
        var tanggals:MutableList<String> = mutableListOf()

        var lv_pengumuman:ListView = findViewById(R.id.lv_pengumuman)
        var perulangandata = Pengumuman_item(this, juduls, tanggals)
        lv_pengumuman.adapter = perulangandata
    }
}