package com.sistempakar.skripsiricky.Utility

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sistempakar.skripsiricky.Model.dataview
import com.sistempakar.skripsiricky.R

class DBviewM (
    private var data: List<dataview>,
    private val listener: (dataview) -> Unit)
    : RecyclerView.Adapter<DBviewM.LeagueViewHolder>()  {

    lateinit var ContextAdapter : Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LeagueViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        ContextAdapter = parent.context
        val inflatedView: View = layoutInflater.inflate(R.layout.act_monstera_adansonii, parent, false)

        return LeagueViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: LeagueViewHolder, position: Int) {
        holder.bindItem(data[position], listener, ContextAdapter, position)
    }

    override fun getItemCount(): Int = data.size

    class LeagueViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val txtTitle: TextView = view.findViewById(R.id.txt_judul)
        private val txtDesk: TextView = view.findViewById(R.id.des_monstera)
        private val ivImage: ImageView = view.findViewById(R.id.iv_monsteraAdansonii)

        fun bindItem(data: dataview, listener: (dataview) -> Unit, context : Context, position : Int) {

            txtTitle.text = data.judul
            txtDesk.text = data.deskripsi_tanaman

//            Glide.with(context)
//                .load(data.img)
//                .into(ivImage);

            itemView.setOnClickListener {
                listener(data)
            }
        }

    }

}