package com.sistempakar.skripsiricky.Home.diagnosa

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.sistempakar.skripsiricky.Home.Home
import com.sistempakar.skripsiricky.R
import com.sistempakar.skripsiricky.Utility.PreferenceKT

class SplashScreenDiagnosaKT : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_splashscreen_diagnosa)

        var handler = Handler()
        handler.postDelayed({
            var intent = Intent(this@SplashScreenDiagnosaKT, HdiagnosaKT::class.java)
            startActivity(intent)
        },3000)
    }
}