package com.sistempakar.skripsiricky.Home.diagnosa

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.sistempakar.skripsiricky.R
import kotlinx.android.synthetic.main.test.*

class TestKT : DiagnosariwayatKT(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test)
        val arrayAdapter: ArrayAdapter<*>
        var mListView = findViewById<ListView>(R.id.testLv)
        val users = arrayListOf<String>("aba","tsa","hahaha")
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
        mListView.adapter = arrayAdapter
    }
}
