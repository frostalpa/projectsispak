package com.sistempakar.skripsiricky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.sistempakar.skripsiricky.Onboarding.KTonboarding1

class SplashScreenKT : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen_act)
        var handler = Handler()
        handler.postDelayed({
            var intent = Intent(this@SplashScreenKT, KTonboarding1::class.java)
            startActivity(intent)
            finish()
        },1500)
    }
}