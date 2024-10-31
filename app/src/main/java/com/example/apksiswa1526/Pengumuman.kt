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
        juduls.add("pengumuman amikom 1")
        juduls.add("pengumuman amikom 2")
        juduls.add("pengumuman amikom 3")
        juduls.add("pengumuman amikom 4")
        juduls.add("pengumuman amikom 5")
        juduls.add("pengumuman amikom 6")
        juduls.add("pengumuman amikom 7")
        juduls.add("pengumuman amikom 8")
        juduls.add("pengumuman amikom 9")
        juduls.add("pengumuman amikom 10")

        var tanggals:MutableList<String> = mutableListOf()
        tanggals.add("1 Januari 2024")
        tanggals.add("1 Februari 2024")
        tanggals.add("1 Maret 2024")
        tanggals.add("1 April 2024")
        tanggals.add("1 Mei 2024")
        tanggals.add("1 Juni 2024")
        tanggals.add("1 Juli 2024")
        tanggals.add("1 Agustus 2024")
        tanggals.add("1 September 2024")
        tanggals.add("1 Oktober 2024")

        var lv_pengumuman:ListView = findViewById(R.id.lv_pengumuman)
        var perulangandata = Pengumuman_item(this, juduls, tanggals)
        lv_pengumuman.adapter = perulangandata
    }
}