package com.example.apksiswa1526

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.dashboard)
        /* ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        } */

        val cv_akun:CardView = findViewById(R.id.cv_akun)
        val cv_pengumuman:CardView = findViewById(R.id.cv_pengumuman)
        val cv_materi:CardView = findViewById(R.id.cv_materi)
        val cv_nilai:CardView = findViewById(R.id.cv_nilai)
        val cv_presensi:CardView = findViewById(R.id.cv_presensi)
        val cv_logout:CardView = findViewById(R.id.cv_logout)

        cv_akun.setOnClickListener{
            val pindah:Intent = Intent(this, Akun::class.java)
            startActivity(pindah)
        }

        cv_presensi.setOnClickListener{
            val pindah:Intent = Intent(this, Presensi::class.java)
            startActivity(pindah)
        }
        cv_materi.setOnClickListener{
            val pindah:Intent = Intent(this, Materi::class.java)
            startActivity(pindah)
        }

        cv_nilai.setOnClickListener{
            val pindah:Intent = Intent(this, Nilai::class.java)
            startActivity(pindah)
        }

        cv_pengumuman.setOnClickListener{
            val pindah:Intent = Intent(this, Pengumuman::class.java)
            startActivity(pindah)
        }

        cv_logout.setOnClickListener {
            val pindah:Intent = Intent(this, Login::class.java)
            startActivity(pindah)
        }

    }
}