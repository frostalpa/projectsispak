package com.sistempakar.skripsiricky.tambahan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sistempakar.skripsiricky.Home.F_HomeKT
import com.sistempakar.skripsiricky.R
import kotlinx.android.synthetic.main.act_kutukapas.*
import kotlinx.android.synthetic.main.act_monstera_adansonii.*

class kutukapasKT : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_kutukapas)

        btn_back_kutu.setOnClickListener {
            var intent = Intent(this@kutukapasKT, F_HomeKT::class.java)
            startActivity(intent)
        }
    }
}