package com.example.apksiswa1526

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login)
         ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val edt_nis:EditText = findViewById(R.id.edt_nis)
        val edt_password:EditText = findViewById(R.id.edt_password)
        val btn_login:Button = findViewById(R.id.btn_login)

        //btn login ditekan
        btn_login.setOnClickListener {
            //pindah halaman dari halaman ini ke halaman Dashboard
            val pindah:Intent = Intent(this, Dashboard::class.java)
            startActivity(pindah)
        }
    }
}