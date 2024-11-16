package com.example.apksiswa1526

import android.os.Bundle
import android.util.Log
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

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
        val minta = Volley.newRequestQueue(this)
        val mintaData:StringRequest = object : StringRequest(
            Request.Method.POST,
            "http://192.168.1.32/android_amikom/pengumuman_tampil.php",
            Response.Listener<String> { response->
                val dataarray = JSONObject(response).getJSONArray("data")

                for (i in 0 until dataarray.length()) {
                    val jdl = dataarray.getJSONObject(i).getString("judul_pengumuman")
                    val tgl = dataarray.getJSONObject(i).getString("tanggal_pengumuman")

                    juduls.add(jdl)
                    tanggals.add(tgl)
                }
                var perulangandata = Pengumuman_item(this, juduls, tanggals)
                lv_pengumuman.adapter = perulangandata
            },
            Response.ErrorListener {
                Log.d("eekror", "bermasalah")
            }
        ) {
            override fun getParams(): MutableMap<String, String>? {
                val bawaan:MutableMap<String, String> = HashMap()
                bawaan.put("kode", "amikomoke")

                return bawaan
            }
        }
        minta.add(mintaData)

    }
}