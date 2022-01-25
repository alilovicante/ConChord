package com.example.conchord

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class AkordiAdapter(private val items: List<ResponseData>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.akordi_row, parent,
                false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is ViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int{
        return items.size
    }


    class ViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val strings: TextView = itemView.findViewById(R.id.strings)
        private val fingering: TextView = itemView.findViewById(R.id.fingering)
        private val chordName: TextView = itemView.findViewById(R.id.chordName)

        fun bind(akordi: ResponseData){
            strings.text = akordi.strings
            fingering.text = akordi.fingering
            chordName.text = akordi.chordName
        }
    }

}