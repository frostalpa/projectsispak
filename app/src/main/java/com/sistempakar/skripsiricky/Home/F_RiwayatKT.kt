package com.sistempakar.skripsiricky.Home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.*
import com.sistempakar.skripsiricky.R
import com.sistempakar.skripsiricky.Utility.PreferenceKT
import com.sistempakar.skripsiricky.Model.riwayat
import kotlinx.android.synthetic.main.fragment_riwayat.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [F_RiwayatKT.newInstance] factory method to
 * create an instance of this fragment.
 */
class F_RiwayatKT : Fragment() {

    private lateinit var preferences: PreferenceKT
    lateinit var mDatabase: DatabaseReference
    private var dataList = ArrayList<riwayat>()

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

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
        return inflater.inflate(R.layout.fragment_riwayat, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        preferences = PreferenceKT(requireActivity().applicationContext)
        mDatabase = FirebaseDatabase.getInstance().getReference("riwayat")

        rv_riwayat.layoutManager = LinearLayoutManager(requireContext().applicationContext)
        getData()
    }

    private fun getData() {
        mDatabase.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {

                dataList.clear()
                for (getdataSnapshot in dataSnapshot.getChildren()) {

                    val riwayat1 = getdataSnapshot.getValue(riwayat::class.java!!)
                    dataList.add(riwayat1!!)
                }

                rv_riwayat.adapter = ComingSoonAdapter(dataList) {
                }

            }

            override fun onCancelled(error: DatabaseError) {

            }
        })
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment F_RiwayatKT.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            F_RiwayatKT().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}