package com.sistempakar.skripsiricky.Home


import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.sistempakar.skripsiricky.Home.diagnosa.F_DiagnosaKT
import com.sistempakar.skripsiricky.R
import com.sistempakar.skripsiricky.Utility.PreferenceKT
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_diagnosa.*


class Home : AppCompatActivity() {

    lateinit var preferences: PreferenceKT

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val fragmentdiagnose = F_DiagnosaKT()
        val fragmentHistory = F_RiwayatKT()
        val fragmentHome = F_HomeKT()

        preferences = PreferenceKT(this)
        preferences.setValues("onboarding", "1")

        setFragment(fragmentHome)
        ivmenu.setOnClickListener {
            setFragment(fragmentHome)
            changeIcon(ivmenu, R.drawable.home_active)
            changeIcon(ivmenu2,R.drawable.search)
            changeIcon(BNB_history,R.drawable.history)
        }
        ivmenu2.setOnClickListener {
            setFragment(fragmentdiagnose)
            changeIcon(ivmenu, R.drawable.home)
            changeIcon(ivmenu2,R.drawable.search_active)
            changeIcon(BNB_history,R.drawable.history)
        }
        BNB_history.setOnClickListener {
            setFragment(fragmentHistory)
            changeIcon(ivmenu, R.drawable.home)
            changeIcon(ivmenu2,R.drawable.search)
            changeIcon(BNB_history,R.drawable.history_active)
        }
    }
    private fun setFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransacion = fragmentManager.beginTransaction()
        fragmentTransacion.replace(R.id.layout_frame,fragment)
        fragmentTransacion.commit()
    }
    private fun changeIcon(imageView: ImageView, int: Int){
        imageView.setImageResource(int)
    }
}