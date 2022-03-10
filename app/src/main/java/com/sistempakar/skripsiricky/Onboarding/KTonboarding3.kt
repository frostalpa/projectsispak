package com.sistempakar.skripsiricky.Onboarding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sistempakar.skripsiricky.Home.Home
import com.sistempakar.skripsiricky.R
import kotlinx.android.synthetic.main.onboarding3.*

class KTonboarding3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding3)
        Btn_lewati3.setOnClickListener {
            finishAffinity()
            var intent = Intent(this@KTonboarding3, Home::class.java)
            startActivity(intent)
        }
        Btn_selanjutnya3.setOnClickListener {
            var intent = Intent(this@KTonboarding3, KTonboarding4::class.java)
            startActivity(intent)
        }

    }
}