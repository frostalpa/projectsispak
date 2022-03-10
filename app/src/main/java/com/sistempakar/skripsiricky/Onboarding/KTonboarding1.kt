package com.sistempakar.skripsiricky.Onboarding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sistempakar.skripsiricky.Home.Home
import com.sistempakar.skripsiricky.R
import com.sistempakar.skripsiricky.Utility.PreferenceKT
import kotlinx.android.synthetic.main.onboarding1.*


class KTonboarding1 : AppCompatActivity() {

    lateinit var preferences: PreferenceKT

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding1)
        preferences = PreferenceKT(this)

        if (preferences.getValues("onboarding").equals("1")) {
            finishAffinity()

            val intent = Intent(this@KTonboarding1,
                Home::class.java)
            startActivity(intent)
        }

        btn_lewati.setOnClickListener {
            finishAffinity()
            var intent = Intent(this@KTonboarding1, Home::class.java)
            startActivity(intent)
        }
        btn_selanjutnya.setOnClickListener {
            var intent = Intent(this@KTonboarding1, KTonboarding2::class.java)
            startActivity(intent)
        }

    }
}