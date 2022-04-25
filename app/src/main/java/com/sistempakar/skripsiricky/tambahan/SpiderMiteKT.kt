package com.sistempakar.skripsiricky.tambahan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sistempakar.skripsiricky.Home.F_HomeKT
import com.sistempakar.skripsiricky.R
import kotlinx.android.synthetic.main.act_busukfusarium.*
import kotlinx.android.synthetic.main.act_spidermite.*

class SpiderMiteKT : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_spidermite)

        btn_back_belalang.setOnClickListener {
            var intent = Intent(this@SpiderMiteKT, F_HomeKT::class.java)
            startActivity(intent)
        }
    }
}