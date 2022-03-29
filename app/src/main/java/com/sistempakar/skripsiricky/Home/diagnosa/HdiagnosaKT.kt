package com.sistempakar.skripsiricky.Home.diagnosa

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sistempakar.skripsiricky.R
import com.sistempakar.skripsiricky.Utility.PreferenceDiagnosa
import com.sistempakar.skripsiricky.Utility.PreferenceKT
import kotlinx.android.synthetic.main.act_hasil.*

class HdiagnosaKT : AppCompatActivity(){
    lateinit var preferences: PreferenceKT
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_hasil)
        preferences = PreferenceKT(this)
        val TXT_Judul: TextView = findViewById(R.id.txt_jdlpenyakit) as TextView
        val TXT_solusi: TextView = findViewById(R.id.txt_solusi) as TextView
        val IMG: ImageView = findViewById(R.id.img_penyakit) as ImageView
        val kutukapas = resources.getString(R.string.kutu_kapas)
        val spidermite = resources.getString(R.string.spider_mite)
        val blackspot = resources.getString(R.string.black_spot)
        val busukfusarium = resources.getString(R.string.busuk_fusarium)
        val busukdaun = resources.getString(R.string.busuk_daun)
        if (preferences.getValues("hasil").equals("1")) {
            TXT_Judul.text = "Kutu kapas"
            TXT_solusi.text = kutukapas
            preferences.setValues("","")
        }else if (preferences.getValues("hasil").equals("2")){
            TXT_Judul.text = "Spider Mite"
            TXT_solusi.text = spidermite
            preferences.setValues("","")
        }else if (preferences.getValues("hasil").equals("3")){
            TXT_Judul.text = "Black Spot"
            TXT_solusi.text = blackspot
            preferences.setValues("","")
        }else if (preferences.getValues("hasil").equals("4")){
            TXT_Judul.text = "Busuk Fusarium"
            TXT_solusi.text = busukfusarium
            preferences.setValues("","")
        }else if (preferences.getValues("hasil").equals("5")){
            TXT_Judul.text = "Busuk Daun"
            TXT_solusi.text = busukdaun
            preferences.setValues("","")
        }
        btn_DiagnosaKembali.setOnClickListener {
            val intent = Intent(this@HdiagnosaKT,
                DiagnosariwayatKT::class.java)
            startActivity(intent)
        }
        btn_SimpanData.setOnClickListener {
            Toast.makeText(this@HdiagnosaKT,
                "Button Berhasil, Fitur belum tersedia",
                Toast.LENGTH_LONG).show()
        }
    }
}