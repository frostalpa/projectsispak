package com.sistempakar.skripsiricky.Onboarding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sistempakar.skripsiricky.Home.Home
import com.sistempakar.skripsiricky.R
import kotlinx.android.synthetic.main.onboarding1.*
import kotlinx.android.synthetic.main.onboarding4.*

class KTonboarding4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding4)
        Btn_selanjutnya4.setOnClickListener {
        finishAffinity()
            var intent = Intent(this@KTonboarding4, Home::class.java)
            startActivity(intent)
        }
    }
}