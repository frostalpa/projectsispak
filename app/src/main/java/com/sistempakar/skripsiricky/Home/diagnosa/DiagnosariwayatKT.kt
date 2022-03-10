 package com.sistempakar.skripsiricky.Home.diagnosa

import android.app.Activity
import android.content.Intent
import android.content.res.Resources
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.sistempakar.skripsiricky.Home.Home
import com.sistempakar.skripsiricky.Onboarding.KTonboarding1
import com.sistempakar.skripsiricky.R
import kotlinx.android.synthetic.main.act_busukfusarium.*
import kotlinx.android.synthetic.main.act_proses_diagnosa.*
import kotlinx.android.synthetic.main.fragment_diagnosa.*
import kotlinx.android.synthetic.main.test.*
import java.util.ArrayList

 open class DiagnosariwayatKT : AppCompatActivity(){
    open val ListA = arrayListOf<Double>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_proses_diagnosa)
//==================================================================================================
        val pertanyaan: TextView = findViewById(R.id.Question) as TextView
        val res: Resources = resources
        val ask = res.getStringArray(R.array.ask_diagnosa).toMutableList()
        var counter = 0
        val ListR = arrayListOf<Double>()
        val ListC = arrayListOf<Double>()
        val button: Button = findViewById(R.id.btn_Next)


//==================================================================================================
        pertanyaan.text = ask[counter]
//==================================================================================================
        btn_back_pros.setOnClickListener {
            val intent = Intent (F_DiagnosaKT().context, Home::class.java)
            F_DiagnosaKT().startActivity(intent)
            finish()
        }
//==================================================================================================
        btn_Next.setOnClickListener{
            pertanyaan.text = ask[counter]
            counter++
            if (counter >= 16){
                Toast.makeText(this@DiagnosariwayatKT,
                    "Ini Pertanyaan terkahir, Setelah Ini Anda akan diarahkan ke halaman selanjutnya",
                    Toast.LENGTH_LONG).show()
                SpinerPenyakit.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(
                        adapterView: AdapterView<*>?,
                        view: View?,
                        position: Int,
                        id: Long
                    ) {
                        val item = SpinerPenyakit.selectedItem
                        if (item == 0) {
                            ListA.add(0.2)
                            ListA.add(0.5)
                            ListA.add(0.8)
                        } else if (item == 1) {
                            ListA.add(0.2)
                            ListA.add(0.5)
                            ListA.add(0.8)
                        } else if (item == 2) {
                            ListA.add(0.2)
                            ListA.add(0.5)
                            ListA.add(0.8)
                        } else if (item == 3) {
                            ListA.add(0.2)
                            ListA.add(0.5)
                            ListA.add(0.8)
                        } else if (item == 4) {
                            ListA.add(0.2)
                            ListA.add(0.5)
                            ListA.add(0.8)
                        }
                    }
                    override fun onNothingSelected(parent: AdapterView<*>?) {
                    }
                }
                val ListR1 = ListA.map { it }.toTypedArray()
                val nuf = ListR1
                btn_Next.isEnabled=false
                btn_Next.isClickable=false
                button.setBackgroundColor(Color.GRAY)
                button.setTextColor(Color.WHITE)
            }

        }

        if(counter == 16 ){
            var handler = Handler()
            handler.postDelayed({
                var intent = Intent(this@DiagnosariwayatKT, SplashScreenDiagnosaKT::class.java)
                startActivity(intent)
            },3000)
        }
//==================================================================================================
        val spinner: Spinner = findViewById(R.id.SpinerPenyakit)
        // Create an ArrayAdapter using the string array and a default spinner layout
                ArrayAdapter.createFromResource(
                    this,
                    R.array.CF1,
                    android.R.layout.simple_spinner_item
                ).also { adapter ->
                    // Specify the layout to use when the list of choices appears
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                    // Apply the adapter to the spinner
                    spinner.adapter = adapter
                }
//==================================================================================================

    }

}

 private fun <E> ArrayList<E>.get() {
     TODO("Not yet implemented")
 }
