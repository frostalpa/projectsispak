package com.sistempakar.skripsiricky.tambahan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sistempakar.skripsiricky.Home.F_HomeKT
import com.sistempakar.skripsiricky.R
import kotlinx.android.synthetic.main.act_blackspot.*
import kotlinx.android.synthetic.main.act_busukfusarium.*

class blackspotKT : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_blackspot)

        btn_back_blkspt.setOnClickListener {
            var intent = Intent(this@blackspotKT, F_HomeKT::class.java)
            startActivity(intent)
        }
    }
}