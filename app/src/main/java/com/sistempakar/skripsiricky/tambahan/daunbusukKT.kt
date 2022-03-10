package com.sistempakar.skripsiricky.tambahan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sistempakar.skripsiricky.Home.F_HomeKT
import com.sistempakar.skripsiricky.R
import kotlinx.android.synthetic.main.act_busukdaun.*
import kotlinx.android.synthetic.main.act_busukfusarium.*
import kotlinx.android.synthetic.main.act_monstera_adansonii.*

class daunbusukKT : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_busukdaun)

        btn_back_daun.setOnClickListener {
            var intent = Intent(this@daunbusukKT, F_HomeKT::class.java)
            startActivity(intent)
        }
    }
}