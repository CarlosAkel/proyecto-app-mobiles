package com.example.entrega_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val onClickListener: OnClickListener):
    RecyclerView.Adapter<Adapter.AdapterViewHolder>() {

    var generalist = arrayListOf<Int>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.AdapterViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.card_rec, parent, false)
        return AdapterViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return generalist.size
    }

    override fun onBindViewHolder(holder: Adapter.AdapterViewHolder, position: Int) {
        val item = generalist[position]
        holder.textView1.text = item.toString()
        //Se aplica la interfaz entregada en este caso por la MainActivity
        holder.itemView.setOnClickListener {
            onClickListener.onClickItem(item)
        }
    }

    class AdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView1: TextView = itemView.findViewById(R.id.textView)

    }
}