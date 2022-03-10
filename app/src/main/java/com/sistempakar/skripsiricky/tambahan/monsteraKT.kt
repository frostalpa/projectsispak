package com.sistempakar.skripsiricky.tambahan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sistempakar.skripsiricky.Home.F_HomeKT
import com.sistempakar.skripsiricky.Home.Home
import com.sistempakar.skripsiricky.R
import kotlinx.android.synthetic.main.act_monstera_adansonii.*
import kotlinx.android.synthetic.main.onboarding1.*

class monsteraKT : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_monstera_adansonii)

        btn_back_monstera.setOnClickListener {
            var intent = Intent(this@monsteraKT, F_HomeKT::class.java)
            startActivity(intent)
        }
    }
}