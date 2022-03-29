 package com.sistempakar.skripsiricky.Home.diagnosa

import android.content.Intent
import android.content.res.Resources
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.sistempakar.skripsiricky.Home.Home
import com.sistempakar.skripsiricky.R
import com.sistempakar.skripsiricky.Utility.PreferenceDiagnosa
import com.sistempakar.skripsiricky.Utility.PreferenceKT
import kotlinx.android.synthetic.main.act_busukfusarium.*
import kotlinx.android.synthetic.main.act_proses_diagnosa.*
import kotlinx.android.synthetic.main.fragment_diagnosa.*
import kotlinx.android.synthetic.main.test.*

 open class DiagnosariwayatKT : AppCompatActivity(){
     lateinit var preferences: PreferenceKT
     open var ListA = mutableListOf<Double>()
     var myMap = ListA.associateBy({it},{it})
     val Nilai = myMap.values

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_proses_diagnosa)
//==================================================================================================
        val pertanyaan: TextView = findViewById(R.id.Question) as TextView
        val txt_counter: TextView = findViewById(R.id.txt_counter) as TextView
        val SpinnerList: TextView = findViewById(R.id.IDSpinerList) as TextView
        val res: Resources = resources
        val ask = res.getStringArray(R.array.ask_diagnosa).toMutableList()
        var counter = 0
        var proses = 0
        val button: Button = findViewById(R.id.btn_Next)
        preferences = PreferenceKT(this)

//==================================================================================================
        btn_back_pros.setOnClickListener {
            val intent = Intent (F_DiagnosaKT().context, Home::class.java)
            F_DiagnosaKT().startActivity(intent)
            finish()
        }
//==================================================================================================
        button.setOnClickListener{
            txt_counter.text = counter.toString()
            pertanyaan.text = ask[counter]
            SpinnerList.text = SpinerPenyakit.selectedItemPosition.toString()
            if (proses == 1){
                Toast.makeText(this@DiagnosariwayatKT,
                    "This is the last question, after this you will be redirected to another page",
                    Toast.LENGTH_LONG).show()
                btn_Next.isEnabled=false
                btn_Next.isClickable=false
                button.setBackgroundColor(Color.GRAY)
                button.setTextColor(Color.WHITE)

                // MatrixG1
                var N1 = ListA.elementAt(0)
                var N2 = ListA.elementAt(1)
                var N3 = ListA.elementAt(2)
                //================================
                var N13 = ListA.elementAt(12)
                var N14 = ListA.elementAt(13)
                var N15 = ListA.elementAt(14)
                //================================
                var N25 = ListA.elementAt(24)
                var N26 = ListA.elementAt(25)
                var N27 = ListA.elementAt(26)
                //================================
                var N37 = ListA.elementAt(36)
                var N38 = ListA.elementAt(37)
                var N39 = ListA.elementAt(38)
                //================================
                var N49 = ListA.elementAt(48)
                var N50 = ListA.elementAt(49)
                var N51 = ListA.elementAt(50)

                //MatrixG2
                var N4 = ListA.elementAt(3)
                var N5 = ListA.elementAt(4)
                var N6 = ListA.elementAt(5)
                //================================
                var N16 = ListA.elementAt(15)
                var N17 = ListA.elementAt(16)
                var N18 = ListA.elementAt(17)
                //================================
                var N28 = ListA.elementAt(27)
                var N29 = ListA.elementAt(28)
                var N30 = ListA.elementAt(29)
                //================================
                var N40 = ListA.elementAt(39)
                var N41 = ListA.elementAt(40)
                var N42 = ListA.elementAt(41)
                //================================
                var N52 = ListA.elementAt(51)
                var N53 = ListA.elementAt(52)
                var N54 = ListA.elementAt(53)

                //MatrixG3
                var N7 = ListA.elementAt(6)
                var N8 = ListA.elementAt(7)
                var N9 = ListA.elementAt(8)
                //================================
                var N19 = ListA.elementAt(18)
                var N20 = ListA.elementAt(19)
                var N21 = ListA.elementAt(20)
                //================================
                var N31 = ListA.elementAt(30)
                var N32 = ListA.elementAt(31)
                var N33 = ListA.elementAt(32)
                //================================
                var N43 = ListA.elementAt(42)
                var N44 = ListA.elementAt(43)
                var N45 = ListA.elementAt(44)
                //================================
                var N55 = ListA.elementAt(54)
                var N56 = ListA.elementAt(55)
                var N57 = ListA.elementAt(56)

                //MatrikG4
                var N10 = ListA.elementAt(9)
                var N11 = ListA.elementAt(10)
                var N12 = ListA.elementAt(11)
                //================================
                var N22 = ListA.elementAt(21)
                var N23 = ListA.elementAt(22)
                var N24 = ListA.elementAt(23)
                //================================
                var N34 = ListA.elementAt(33)
                var N35 = ListA.elementAt(34)
                var N36 = ListA.elementAt(35)
                //================================
                var N46 = ListA.elementAt(45)
                var N47 = ListA.elementAt(46)
                var N48 = ListA.elementAt(47)
                //================================
                var N58 = ListA.elementAt(57)
                var N59 = ListA.elementAt(58)
                var N60 = ListA.elementAt(59)

                //============w===================
                var wa1 = (0.2)
                var wa2 = (0.3)
                var wa3 = (0.6)

                var wb1 = (0.0)
                var wb2 = (0.2)
                var wb3 = (0.3)

                var wc1 = (0.7)
                var wc2 = (0.8)
                var wc3 = (1.0)

                var wd1 = (0.7)
                var wd2 = (0.8)
                var wd3 = (1.0)

                ///====================================G1====================================================
                //--------------1a-----------------
                var Ma21= nuF(N1,N2,N3,N13,N14,N15)
                var Sa2 = SortPower(Ma21)
                var Ma31= nuF(N1,N2,N3,N25,N26,N27)
                var Sa3 = SortPower(Ma31)
                var Ma41= nuF(N1,N2,N3,N37,N38,N39)
                var Sa4 = SortPower(Ma41)
                var Ma51= nuF(N1,N2,N3,N49,N50,N51)
                var Sa5 = SortPower(Ma51)
                var HM11=Sa2+Sa3+Sa4+Sa5
                //--------------2a-----------------
                var Mb11= nuF(N13,N14,N15,N1,N2,N3)
                var Sb1 = SortPower(Mb11)
                var Mb31= nuF(N13,N14,N15,N25,N26,N27)
                var Sb3 = SortPower(Mb31)
                var Mb41= nuF(N13,N14,N15,N37,N38,N39)
                var Sb4 = SortPower(Mb41)
                var Mb51= nuF(N13,N14,N15,N49,N50,N51)
                var Sb5 = SortPower(Mb51)
                var HM21=Sb1+Sb3+Sb4+Sb5
                //--------------3a-----------------
                var Mc11= nuF(N25,N26,N27,N1,N2,N3)
                var Sc1 = SortPower(Mc11)
                var Mc21= nuF(N25,N26,N27,N13,N14,N15)
                var Sc2 = SortPower(Mc21)
                var Mc41= nuF(N25,N26,N27,N37,N38,N39)
                var Sc4 = SortPower(Mc41)
                var Mc51= nuF(N25,N26,N27,N49,N50,N51)
                var Sc5 = SortPower(Mc51)
                var HM31=Sc1+Sc2+Sc4+Sc5
                //--------------4a-----------------
                var Md11= nuF(N37,N38,N39,N1,N2,N3)
                var Sd1 = SortPower(Md11)
                var Md21= nuF(N37,N38,N39,N13,N14,N15)
                var Sd2 = SortPower(Md21)
                var Md31= nuF(N37,N38,N39,N25,N26,N27)
                var Sd3 = SortPower(Md31)
                var Md51= nuF(N37,N38,N39,N49,N50,N51)
                var Sd5 = SortPower(Md51)
                var HM41=Sd1+Sd2+Sd3+Sd5
                //--------------5a-----------------
                var Me11= nuF(N49,N50,N51,N1,N2,N3)
                var Se1 = SortPower(Me11)
                var Me21= nuF(N49,N50,N51,N13,N14,N15)
                var Se2 = SortPower(Me21)
                var Me31= nuF(N49,N50,N51,N25,N26,N27)
                var Se3 = SortPower(Me31)
                var Me41= nuF(N49,N50,N51,N25,N26,N27)
                var Se4 = SortPower(Me41)
                var HM51=Se1+Se2+Se3+Se4
                //===================================G2===================================
                //--------------1b-----------------
                var Ma22= nuF(N4,N5,N6,N16,N17,N18)
                var Sa22 = SortPower(Ma22)
                var Ma32= nuF(N4,N5,N6,N28,N29,N30)
                var Sa32 = SortPower(Ma32)
                var Ma42= nuF(N4,N5,N6,N40,N41,N42)
                var Sa42 = SortPower(Ma42)
                var Ma52= nuF(N4,N5,N6,N52,N53,N54)
                var Sa52 = SortPower(Ma52)
                var HM12=Sa22+Sa32+Sa42+Sa52
                //--------------2b-----------------
                var Mb12= nuF(N16,N17,N18,N4,N5,N6)
                var Sb12 = SortPower(Mb12)
                var Mb32= nuF(N16,N17,N18,N28,N29,N30)
                var Sb32 = SortPower(Mb32)
                var Mb42= nuF(N16,N17,N18,N40,N41,N42)
                var Sb42 = SortPower(Mb42)
                var Mb52= nuF(N16,N17,N18,N52,N53,N54)
                var Sb52 = SortPower(Mb52)
                var HM22=Sb12+Sb32+Sb42+Sb52
                //--------------3b-----------------
                var Mc12= nuF(N28,N29,N30,N4,N5,N6)
                var Sc12 = SortPower(Mc12)
                var Mc22= nuF(N28,N29,N30,N16,N17,N18)
                var Sc22 = SortPower(Mc22)
                var Mc42= nuF(N28,N29,N30,N40,N41,N42)
                var Sc42 = SortPower(Mc42)
                var Mc52= nuF(N28,N29,N30,N52,N53,N54)
                var Sc52 = SortPower(Mc52)
                var HM33=Sc12+Sc22+Sc42+Sc52
                //--------------4b-----------------
                var Md12= nuF(N40,N41,N42,N4,N5,N6)
                var Sd12 = SortPower(Md12)
                var Md22= nuF(N40,N41,N42,N16,N17,N18)
                var Sd22 = SortPower(Md22)
                var Md32= nuF(N40,N41,N42,N28,N29,N30)
                var Sd32 = SortPower(Md32)
                var Md52= nuF(N40,N41,N42,N52,N53,N54)
                var Sd52 = SortPower(Md52)
                var HM42=Sd12+Sd22+Sd32+Sd52
                //--------------5b-----------------
                var Me12= nuF(N52,N53,N54,N4,N5,N6)
                var Se12 = SortPower(Me12)
                var Me22 = nuF(N52,N53,N54,N16,N17,N18)
                var Se22 = SortPower(Me22)
                var Me32= nuF(N52,N53,N54,N28,N29,N30)
                var Se32 = SortPower(Me32)
                var Me42 = nuF(N52,N53,N54,N40,N41,N42)
                var Se42 = SortPower(Me42)
                var HM52 =Se12+Se22+Se32+Se42
                //===================================G3===================================
                //--------------1b-----------------
                var Ma23= nuF(N7,N8,N9,N19,N20,N21)
                var Sa23 = SortPower(Ma23)
                var Ma33= nuF(N7,N8,N9,N31,N32,N33)
                var Sa33 = SortPower(Ma33)
                var Ma43= nuF(N7,N8,N9,N43,N44,N45)
                var Sa43 = SortPower(Ma43)
                var Ma53= nuF(N7,N8,N9,N55,N56,N57)
                var Sa53 = SortPower(Ma53)
                var HM13=Sa23+Sa33+Sa43+Sa53
                //--------------2b-----------------
                var Mb13= nuF(N19,N20,N21,N7,N8,N9)
                var Sb13 = SortPower(Mb13)
                var Mb33= nuF(N19,N20,N21,N31,N32,N33)
                var Sb33 = SortPower(Mb33)
                var Mb43= nuF(N19,N20,N21,N43,N44,N45)
                var Sb43 = SortPower(Mb43)
                var Mb53= nuF(N19,N20,N21,N55,N56,N57)
                var Sb53 = SortPower(Mb53)
                var HM23=Sb13+Sb33+Sb43+Sb53
                //--------------3b-----------------
                var Mc13= nuF(N31,N32,N33,N7,N8,N9)
                var Sc13 = SortPower(Mc13)
                var Mc23= nuF(N31,N32,N33,N19,N20,N21)
                var Sc23 = SortPower(Mc23)
                var Mc43= nuF(N31,N32,N33,N43,N44,N45)
                var Sc43 = SortPower(Mc43)
                var Mc53= nuF(N31,N32,N33,N55,N56,N57)
                var Sc53 = SortPower(Mc53)
                var HM32=Sc13+Sc23+Sc43+Sc53
                //--------------4b-----------------
                var Md13= nuF(N43,N44,N45,N7,N8,N9)
                var Sd13 = SortPower(Md13)
                var Md23= nuF(N43,N44,N45,N19,N20,N21)
                var Sd23 = SortPower(Md23)
                var Md33= nuF(N43,N44,N45,N31,N32,N33)
                var Sd33 = SortPower(Md33)
                var Md53= nuF(N43,N44,N45,N55,N56,N57)
                var Sd53 = SortPower(Md53)
                var HM43=Sd13+Sd23+Sd33+Sd53
                //--------------5b-----------------
                var Me13= nuF(N55,N56,N57,N7,N8,N9)
                var Se13 = SortPower(Me13)
                var Me23 = nuF(N55,N56,N57,N19,N20,N21)
                var Se23 = SortPower(Me23)
                var Me33 = nuF(N55,N56,N57,N31,N32,N33)
                var Se33 = SortPower(Me33)
                var Me43 = nuF(N55,N56,N57,N43,N44,N45)
                var Se43 = SortPower(Me43)
                var HM53 =Se13+Se23+Se33+Se43
                //===================================G4===================================
                //--------------1b-----------------
                var Ma24= nuF(N10,N11,N12,N22,N23,N24)
                var Sa24 = SortPower(Ma24)
                var Ma34= nuF(N10,N11,N12,N34,N35,N36)
                var Sa34 = SortPower(Ma34)
                var Ma44= nuF(N10,N11,N12,N46,N47,N48)
                var Sa44 = SortPower(Ma44)
                var Ma54= nuF(N10,N11,N12,N58,N59,N60)
                var Sa54 = SortPower(Ma54)
                var HM14=Sa24+Sa34+Sa44+Sa54
                //--------------2b-----------------
                var Mb14 = nuF(N22,N23,N24,N10,N11,N12)
                var Sb14 = SortPower(Mb14)
                var Mb34 = nuF(N22,N23,N24,N34,N35,N36)
                var Sb34 = SortPower(Mb34)
                var Mb44 = nuF(N22,N23,N24,N46,N47,N48)
                var Sb44 = SortPower(Mb44)
                var Mb54 = nuF(N22,N23,N24,N58,N59,N60)
                var Sb54 = SortPower(Mb54)
                var HM24 =Sb14+Sb34+Sb44+Sb54
                //--------------3b-----------------
                var Mc14 = nuF(N34,N35,N36,N10,N11,N12)
                var Sc14 = SortPower(Mc14)
                var Mc24 = nuF(N34,N35,N36,N22,N23,N24)
                var Sc24 = SortPower(Mc24)
                var Mc44 = nuF(N34,N35,N36,N46,N47,N48)
                var Sc44 = SortPower(Mc44)
                var Mc54 = nuF(N34,N35,N36,N58,N59,N60)
                var Sc54 = SortPower(Mc54)
                var HM34=Sc14+Sc24+Sc44+Sc54
                //-------------4b-----------------
                var Md14 = nuF(N46,N47,N48,N10,N11,N12)
                var Sd14 = SortPower(Md14)
                var Md24 = nuF(N46,N47,N48,N22,N23,N24)
                var Sd24 = SortPower(Md24)
                var Md34 = nuF(N46,N47,N48,N34,N35,N36)
                var Sd34 = SortPower(Md34)
                var Md54 = nuF(N46,N47,N48,N58,N59,N60)
                var Sd54 = SortPower(Md54)
                var HM44=Sd14+Sd24+Sd34+Sd54
                //--------------5b-----------------
                var Me14 = nuF(N58,N59,N60,N10,N11,N12)
                var Se14 = SortPower(Me14)
                var Me24 = nuF(N58,N59,N60,N22,N23,N24)
                var Se24 = SortPower(Me24)
                var Me34 = nuF(N58,N59,N60,N34,N35,N36)
                var Se34 = SortPower(Me34)
                var Me44 = nuF(N58,N59,N60,N46,N47,N48)
                var Se44 = SortPower(Me44)
                var HM54 = Se14+Se24+Se34+Se44

                //==========================Matrik Kelemahan ===============================================
                ///====================================G1====================================================
                //--------------1a-----------------
                var Mka21= nuF(N13,N14,N15,N1,N2,N3)
                var Ska2 = SortPower(Mka21)
                var Mka31= nuF(N25,N26,N27,N1,N2,N3)
                var Ska3 = SortPower(Mka31)
                var Mka41= nuF(N37,N38,N39,N1,N2,N3)
                var Ska4 = SortPower(Mka41)
                var Mka51= nuF(N49,N50,N51,N1,N2,N3)
                var Ska5 = SortPower(Mka51)
                var HkM11=Ska2+Ska3+Ska4+Ska5
                //--------------2a-----------------
                var Mkb11= nuF(N1,N2,N3,N13,N14,N15)
                var Skb1 = SortPower(Mkb11)
                var Mkb31= nuF(N25,N26,N27,N13,N14,N15)
                var Skb3 = SortPower(Mkb31)
                var Mkb41= nuF(N37,N38,N39,N13,N14,N15)
                var Skb4 = SortPower(Mkb41)
                var Mkb51= nuF(N49,N50,N51,N13,N14,N15)
                var Skb5 = SortPower(Mkb51)
                var HkM21=Skb1+Skb3+Skb4+Skb5
                //--------------3a-----------------
                var Mkc11= nuF(N1,N2,N3,N25,N26,N27)
                var Skc1 = SortPower(Mkc11)
                var Mkc21= nuF(N13,N14,N15,N25,N26,N27)
                var Skc2 = SortPower(Mkc21)
                var Mkc41= nuF(N37,N38,N39,N25,N26,N27)
                var Skc4 = SortPower(Mkc41)
                var Mkc51= nuF(N49,N50,N51,N25,N26,N27)
                var Skc5 = SortPower(Mkc51)
                var HkM31=Skc1+Skc2+Skc4+Skc5
                //--------------4a-----------------
                var Mkd11= nuF(N1,N2,N3,N37,N38,N39)
                var Skd1 = SortPower(Mkd11)
                var Mkd21= nuF(N13,N14,N15,N37,N38,N39)
                var Skd2 = SortPower(Mkd21)
                var Mkd31= nuF(N25,N26,N27,N37,N38,N39)
                var Skd3 = SortPower(Mkd31)
                var Mkd51= nuF(N49,N50,N51,N37,N38,N39)
                var Skd5 = SortPower(Mkd51)
                var HkM41=Skd1+Skd2+Skd3+Skd5
                //--------------5a-----------------
                var Mke11= nuF(N1,N2,N3,N49,N50,N51)
                var Ske1 = SortPower(Mke11)
                var Mke21= nuF(N13,N14,N15,N49,N50,N51)
                var Ske2 = SortPower(Mke21)
                var Mke31= nuF(N25,N26,N27,N49,N50,N51)
                var Ske3 = SortPower(Mke31)
                var Mke41= nuF(N37,N38,N39,N49,N50,N51)
                var Ske4 = SortPower(Mke41)
                var HkM51=Ske1+Ske2+Ske3+Ske4
                //===================================G2===================================
                //--------------1b-----------------
                var Mka22= nuF(N16,N17,N18,N4,N5,N6)
                var Ska22 = SortPower(Mka22)
                var Mka32= nuF(N28,N29,N30,N4,N5,N6)
                var Ska32 = SortPower(Mka32)
                var Mka42= nuF(N40,N41,N42,N4,N5,N6)
                var Ska42 = SortPower(Mka42)
                var Mka52= nuF(N52,N53,N54,N4,N5,N6)
                var Ska52 = SortPower(Mka52)
                var HkM12=Ska22+Ska32+Ska42+Ska52
                //--------------2b-----------------
                var Mkb12= nuF(N4,N5,N6,N16,N17,N18)
                var Skb12 = SortPower(Mkb12)
                var Mkb32= nuF(N28,N29,N30,N16,N17,N18)
                var Skb32 = SortPower(Mkb32)
                var Mkb42= nuF(N40,N41,N42,N16,N17,N18)
                var Skb42 = SortPower(Mkb42)
                var Mkb52= nuF(N52,N53,N54,N16,N17,N18)
                var Skb52 = SortPower(Mkb52)
                var HkM22=Skb12+Skb32+Skb42+Skb52
                //--------------3b-----------------
                var Mkc12= nuF(N4,N5,N6,N28,N29,N30)
                var Skc12 = SortPower(Mkc12)
                var Mkc22= nuF(N16,N17,N18,N28,N29,N30)
                var Skc22 = SortPower(Mkc22)
                var Mkc42= nuF(N40,N41,N42,N28,N29,N30)
                var Skc42 = SortPower(Mkc42)
                var Mkc52= nuF(N52,N53,N54,N28,N29,N30)
                var Skc52 = SortPower(Mkc52)
                var HkM33=Skc12+Skc22+Skc42+Skc52
                //--------------4b-----------------
                var Mkd12= nuF(N4,N5,N6,N40,N41,N42)
                var Skd12 = SortPower(Mkd12)
                var Mkd22= nuF(N16,N17,N18,N40,N41,N42)
                var Skd22 = SortPower(Mkd22)
                var Mkd32= nuF(N28,N29,N30,N40,N41,N42)
                var Skd32 = SortPower(Mkd32)
                var Mkd52= nuF(N52,N53,N54,N40,N41,N42)
                var Skd52 = SortPower(Mkd52)
                var HkM42=Skd12+Skd22+Skd32+Skd52
                //-------------5b-----------------
                var Mke12 = nuF(N4,N5,N6,N52,N53,N54)
                var Ske12 = SortPower(Mke12)
                var Mke22 = nuF(N16,N17,N18,N52,N53,N54)
                var Ske22 = SortPower(Mke22)
                var Mke32 = nuF(N28,N29,N30,N52,N53,N54)
                var Ske32 = SortPower(Mke32)
                var Mke42 = nuF(N40,N41,N42,N52,N53,N54)
                var Ske42 = SortPower(Mke42)
                var HkM52 =Ske12+Ske22+Ske32+Ske42
                //===================================G3===================================
                //--------------1b-----------------
                var Mka23 = nuF(N19,N20,N21,N7,N8,N9)
                var Ska23 = SortPower(Mka23)
                var Mka33 = nuF(N31,N32,N33,N7,N8,N9)
                var Ska33 = SortPower(Mka33)
                var Mka43 = nuF(N43,N44,N45,N7,N8,N9)
                var Ska43 = SortPower(Mka43)
                var Mka53 = nuF(N55,N56,N57,N7,N8,N9)
                var Ska53 = SortPower(Mka53)
                var HkM13 =Ska23+Ska33+Ska43+Ska53
                //--------------2b-----------------
                var Mkb13 = nuF(N7,N8,N9,N19,N20,N21)
                var Skb13 = SortPower(Mkb13)
                var Mkb33 = nuF(N31,N32,N33,N19,N20,N21)
                var Skb33 = SortPower(Mkb33)
                var Mkb43 = nuF(N43,N44,N45,N19,N20,N21)
                var Skb43 = SortPower(Mkb43)
                var Mkb53 = nuF(N55,N56,N57,N19,N20,N21)
                var Skb53 = SortPower(Mkb53)
                var HkM23 = Skb13+Skb33+Skb43+Skb53
                //--------------3b-----------------
                var Mkc13 = nuF(N7,N8,N9,N31,N32,N33)
                var Skc13 = SortPower(Mkc13)
                var Mkc23 = nuF(N19,N20,N21,N31,N32,N33)
                var Skc23 = SortPower(Mkc23)
                var Mkc43 = nuF(N43,N44,N45,N31,N32,N33)
                var Skc43 = SortPower(Mkc43)
                var Mkc53 = nuF(N55,N56,N57,N31,N32,N33)
                var Skc53 = SortPower(Mkc53)
                var HkM32 = Skc13+Skc23+Skc43+Skc53
                //--------------4b-----------------
                var Mkd13= nuF(N7,N8,N9,N43,N44,N45)
                var Skd13 = SortPower(Mkd13)
                var Mkd23= nuF(N19,N20,N21,N43,N44,N45)
                var Skd23 = SortPower(Mkd23)
                var Mkd33= nuF(N31,N32,N33,N43,N44,N45)
                var Skd33 = SortPower(Mkd33)
                var Mkd53= nuF(N55,N56,N57,N43,N44,N45)
                var Skd53 = SortPower(Mkd53)
                var HkM43=Skd13+Skd23+Skd33+Skd53
                //--------------5b-----------------
                var Mke13 = nuF(N7,N8,N9,N55,N56,N57)
                var Ske13 = SortPower(Mke13)
                var Mke23 = nuF(N19,N20,N21,N55,N56,N57)
                var Ske23 = SortPower(Mke23)
                var Mke33 = nuF(N31,N32,N33,N55,N56,N57)
                var Ske33 = SortPower(Mke33)
                var Mke43 = nuF(N43,N44,N45,N55,N56,N57)
                var Ske43 = SortPower(Mke43)
                var HkM53 = Ske13+Ske23+Ske33+Ske43
                //===================================G4===================================
                //--------------1b-----------------
                var Mka24 = nuF(N22,N23,N24,N10,N11,N12)
                var Ska24 = SortPower(Mka24)
                var Mka34 = nuF(N34,N35,N36,N10,N11,N12)
                var Ska34 = SortPower(Mka34)
                var Mka44 = nuF(N46,N47,N48,N10,N11,N12)
                var Ska44 = SortPower(Mka44)
                var Mka54 = nuF(N58,N59,N60,N10,N11,N12)
                var Ska54 = SortPower(Mka54)
                var HkM14 = Ska24+Ska34+Ska44+Ska54
                //--------------2b-----------------
                var Mkb14 = nuF(N10,N11,N12,N22,N23,N24)
                var Skb14 = SortPower(Mkb14)
                var Mkb34 = nuF(N34,N35,N36,N22,N23,N24)
                var Skb34 = SortPower(Mkb34)
                var Mkb44 = nuF(N46,N47,N48,N22,N23,N24)
                var Skb44 = SortPower(Mkb44)
                var Mkb54 = nuF(N58,N59,N60,N22,N23,N24)
                var Skb54 = SortPower(Mkb54)
                var HkM24 =Skb14+Skb34+Skb44+Skb54
                //--------------3b-----------------
                var Mkc14 = nuF(N10,N11,N12,N34,N35,N36)
                var Skc14 = SortPower(Mkc14)
                var Mkc24 = nuF(N22,N23,N24,N34,N35,N36)
                var Skc24 = SortPower(Mkc24)
                var Mkc44 = nuF(N46,N47,N48,N34,N35,N36)
                var Skc44 = SortPower(Mkc44)
                var Mkc54 = nuF(N58,N59,N60,N34,N35,N36)
                var Skc54 = SortPower(Mkc54)
                var HkM34=Skc14+Skc24+Skc44+Skc54
                //--------------4b-----------------
                var Mkd14 = nuF(N10,N11,N12,N46,N47,N48)
                var Skd14 = SortPower(Mkd14)
                var Mkd24 = nuF(N22,N23,N24,N46,N47,N48)
                var Skd24 = SortPower(Mkd24)
                var Mkd34 = nuF(N34,N35,N36,N46,N47,N48)
                var Skd34 = SortPower(Mkd34)
                var Mkd54 = nuF(N58,N59,N60,N46,N47,N48)
                var Skd54 = SortPower(Mkd54)
                var HkM44=Skd14+Skd24+Skd34+Skd54
                //--------------5b-----------------
                var Mke14 = nuF(N10,N11,N12,N58,N59,N60)
                var Ske14 = SortPower(Mke14)
                var Mke24 = nuF(N22,N23,N24,N58,N59,N60)
                var Ske24 = SortPower(Mke24)
                var Mke34 = nuF(N34,N35,N36,N58,N59,N60)
                var Ske34 = SortPower(Mke34)
                var Mke44 = nuF(N46,N47,N48,N58,N59,N60)
                var Ske44 = SortPower(Mke44)
                var HkM54 = Ske14+Ske24+Ske34+Ske44

                //==================================Matrik Kekuatan=========================================
                var Ha1 = IK1(HM11,HM12,HM13,HM14,wa1,wb1,wc1,wd1)
                var Ha2 = IK1(HM11,HM12,HM13,HM14,wa2,wb2,wc2,wd2)
                var Ha3 = IK1(HM11,HM12,HM13,HM14,wa3,wb3,wc3,wd3)
                var IndekKekuatan1 = Ha1+Ha2+Ha3
                var Hb1 = IK1(HM21,HM22,HM23,HM24,wa1,wb1,wc1,wd1)
                var Hb2 = IK1(HM21,HM22,HM23,HM24,wa2,wb2,wc3,wd2)
                var Hb3 = IK1(HM21,HM22,HM23,HM24,wa3,wb3,wc3,wd3)
                var IndekKekuatan2 = Hb1+Hb2+Hb3
                var Hc1 = IK1(HM31,HM32,HM33,HM34,wa1,wb1,wc1,wd1)
                var Hc2 = IK1(HM31,HM32,HM33,HM34,wa2,wb2,wc2,wd2)
                var Hc3 = IK1(HM31,HM32,HM33,HM34,wa3,wb3,wc3,wd3)
                var IndekKekuatan3 = Hc1+Hc2+Hc3
                var Hd1 = IK1(HM41,HM42,HM43,HM44,wa1,wb1,wc1,wd1)
                var Hd2 = IK1(HM41,HM42,HM43,HM44,wa2,wb2,wc2,wd2)
                var Hd3 = IK1(HM41,HM42,HM43,HM44,wa3,wb3,wc3,wd3)
                var IndekKekuatan4 = Hd1+Hd2+Hd3
                var He1 = IK1(HM51,HM52,HM53,HM54,wa1,wb1,wc1,wd1)
                var He2 = IK1(HM51,HM52,HM53,HM54,wa2,wb2,wc2,wd2)
                var He3 = IK1(HM51,HM52,HM53,HM54,wa3,wb3,wc3,wd3)
                var IndekKekuatan5 = He1+He2+He3
                //==================================Matrik Kelemahan=========================================
                var ka1 = IK1(HkM11,HkM12,HkM13,HkM14,wa1,wb1,wc1,wd1)
                var ka2 = IK1(HkM11,HkM12,HkM13,HkM14,wa2,wb2,wc2,wd2)
                var ka3 = IK1(HkM11,HkM12,HkM13,HkM14,wa3,wb3,wc3,wd3)
                var IndekKelemahan1 = ka1+ka2+ka3
                var kb1 = IK1(HkM21,HkM22,HkM23,HkM24,wa1,wb1,wc1,wd1)
                var kb2 = IK1(HkM21,HkM22,HkM23,HkM24,wa2,wb2,wc3,wd2)
                var kb3 = IK1(HkM21,HkM22,HkM23,HkM24,wa3,wb3,wc3,wd3)
                var IndekKelemahan2 = kb1+kb2+kb3
                var kc1 = IK1(HkM31,HkM32,HkM33,HkM34,wa1,wb1,wc1,wd1)
                var kc2 = IK1(HkM31,HkM32,HkM33,HkM34,wa2,wb2,wc2,wd2)
                var kc3 = IK1(HkM31,HkM32,HkM33,HkM34,wa3,wb3,wc3,wd3)
                var IndekKelemahan3 = kc1+kc2+kc3
                var kd1 = IK1(HkM41,HkM42,HkM43,HkM44,wa1,wb1,wc1,wd1)
                var kd2 = IK1(HkM41,HkM42,HkM43,HkM44,wa2,wb2,wc2,wd2)
                var kd3 = IK1(HkM41,HkM42,HkM43,HkM44,wa3,wb3,wc3,wd3)
                var IndekKelemahan4 = kd1+kd2+kd3
                var ke1 = IK1(HkM51,HkM52,HkM53,HkM54,wa1,wb1,wc1,wd1)
                var ke2 = IK1(HkM51,HkM52,HkM53,HkM54,wa2,wb2,wc2,wd2)
                var ke3 = IK1(HkM51,HkM52,HkM53,HkM54,wa3,wb3,wc3,wd3)
                var IndekKelemahan5 = ke1+ke2+ke3

                var hasil = hasilDiagnosa(IndekKekuatan1,IndekKelemahan1)
                var hasil2 = hasilDiagnosa(IndekKekuatan2,IndekKelemahan2)
                var hasil3 = hasilDiagnosa(IndekKekuatan3,IndekKelemahan3)
                var hasil4 = hasilDiagnosa(IndekKekuatan4,IndekKelemahan4)
                var hasil5 = hasilDiagnosa(IndekKekuatan5,IndekKelemahan5)

                if (hasil > hasil2  && hasil > hasil3 && hasil > hasil4 && hasil > hasil5 ){
                    preferences.setValues("hasil", "1")
                    var intent = Intent(this@DiagnosariwayatKT, SplashScreenDiagnosaKT::class.java)
                    startActivity(intent)

                }else if(hasil2 > hasil  && hasil2 > hasil3  && hasil2 > hasil4  && hasil2 > hasil5 ){
                    preferences.setValues("hasil", "2")
                    var intent = Intent(this@DiagnosariwayatKT, SplashScreenDiagnosaKT::class.java)
                    startActivity(intent)

                }else if(hasil3 > hasil  && hasil3 > hasil2  && hasil3 > hasil4  && hasil3 > hasil5 ){
                    preferences.setValues("hasil", "3")
                    var intent = Intent(this@DiagnosariwayatKT, SplashScreenDiagnosaKT::class.java)
                    startActivity(intent)

                }else if(hasil4 > hasil && hasil4 > hasil2 && hasil4 > hasil3 && hasil4 > hasil5 ){
                    preferences.setValues("hasil", "4")
                    var intent = Intent(this@DiagnosariwayatKT, SplashScreenDiagnosaKT::class.java)
                    startActivity(intent)

                }else if(hasil5 > hasil && hasil5 > hasil2 && hasil5 > hasil3 && hasil5 > hasil4){
                    preferences.setValues("hasil", "5")
                    var intent = Intent(this@DiagnosariwayatKT, SplashScreenDiagnosaKT::class.java)
                    startActivity(intent)

                }else{
                    Toast.makeText(this@DiagnosariwayatKT,
                        "Silahkan Diagnosa Ulang",
                        Toast.LENGTH_LONG).show()
                }
            }else if (counter <= 19 ){
                SpinerPenyakit.onItemSelectedListener = object : AdapterView.OnItemSelectedListener
                {
                    override fun onItemSelected(
                        adapterView: AdapterView<*>?,
                        view: View?,
                        position: Int,
                        id: Long
                    ) {
                        if (SpinerPenyakit.selectedItemPosition == 0) {
                            ListA.add(0.2)
                            ListA.add(0.5)
                            ListA.add(0.8)
                        } else if (SpinerPenyakit.selectedItemPosition == 1) {
                            ListA.add(0.4)
                            ListA.add(0.6)
                            ListA.add(0.8)
                        } else if (SpinerPenyakit.selectedItemPosition == 2) {
                            ListA.add(0.2)
                            ListA.add(0.4)
                            ListA.add(0.6)
                        } else if (SpinerPenyakit.selectedItemPosition == 3) {
                            ListA.add(0.1)
                            ListA.add(0.6)
                            ListA.add(0.8)
                        } else if (SpinerPenyakit.selectedItemPosition == 4) {
                            ListA.add(0.2)
                            ListA.add(0.5)
                            ListA.add(0.6)
                        }
                    }
                    override fun onNothingSelected(parent: AdapterView<*>?) {
                    }
                }
            }else if (counter == 19){
                proses++
            }
            counter++
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
 //===================================Function-START================================================
 fun nuF (a1:Double, a2:Double, a3: Double, b1: Double, b2:Double, b3:Double): Double {
     var sumnuf = (a1 + (a2*2) + a3 - b1 - (b2*2) - b3)/2
     return sumnuf
 }
 fun SortPower (nuF: Double):Double {
     var Nnuf=nuF
     if (nuF >= 0){
         Nnuf = Nnuf
     } else if (nuF < 0) {
         Nnuf = 0.0
     }
     return Nnuf
 }

 fun IK1 (
     a: Double, b: Double, c: Double, d: Double,
     wa1: Double,wa2: Double, wa3: Double, wa4: Double
     ): Double {

     var SumIK1 = (a*wa1)+(b*wa2)+(c*wa3)+(d*wa4)
     return SumIK1
 }

 fun hasilDiagnosa (a: Double,b: Double): Double{
     var hasil = a/(a+b)
     return hasil
 }

 fun maximumto (a: Double, b: Double, c: Double, d: Double, e: Double){


 }

