package com.sistempakar.skripsiricky.Onboarding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sistempakar.skripsiricky.Home.Home
import com.sistempakar.skripsiricky.R
import kotlinx.android.synthetic.main.onboarding2.*

class KTonboarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding2)
        Btn_lewati2.setOnClickListener {
            finishAffinity()
            var intent = Intent(this@KTonboarding2, Home::class.java)
            startActivity(intent)
        }
        Btn_selanjutnya2.setOnClickListener {
            var intent = Intent(this@KTonboarding2, KTonboarding3::class.java)
            startActivity(intent)
        }

    }
}