package com.sistempakar.skripsiricky.Home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.sistempakar.skripsiricky.R
import com.sistempakar.skripsiricky.tambahan.busukfusariumKT
import com.sistempakar.skripsiricky.tambahan.daunbusukKT
import com.sistempakar.skripsiricky.tambahan.kutukapasKT
import com.sistempakar.skripsiricky.tambahan.monsteraKT
import kotlinx.android.synthetic.main.fragment_home.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [F_HomeKT.newInstance] factory method to
 * create an instance of this fragment.
 */
class F_HomeKT : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btn_coba.setOnClickListener{
            val database = Firebase.database
            val myRef = database.getReference("message")

            myRef.setValue("Hello, World!")
        }
        imgMonstera.setOnClickListener{
            val intent = Intent (this@F_HomeKT.context, monsteraKT::class.java)
            startActivity(intent)
        }
        btn_kutukapas.setOnClickListener{
            val intent = Intent (this@F_HomeKT.context, kutukapasKT::class.java)
            startActivity(intent)
        }
        btn_fusarium.setOnClickListener{
            val intent = Intent (this@F_HomeKT.context, busukfusariumKT::class.java)
            startActivity(intent)
        }
        btn_daun.setOnClickListener{
            val intent = Intent (this@F_HomeKT.context, daunbusukKT::class.java)
            startActivity(intent)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment F_HomeKT.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            F_HomeKT().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }

            }

    }
}