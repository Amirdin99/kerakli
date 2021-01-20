package com.example.scientificuzbekistan.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.scientific_uzbekistan.MainActivity
import com.example.scientific_uzbekistan.R
import com.example.scientificuzbekistan.models.Birinchi
import com.example.scientificuzbekistan.models.Ikkinchi
import com.example.scientificuzbekistan.models.ItemData
import kotlinx.android.synthetic.main.item_view1.view.*
import kotlinx.android.synthetic.main.item_view2.view.*

class AdapterScientific(val data: ArrayList<ItemData>, private val listener: MainActivity) :
    RecyclerView.Adapter<AdapterScientific.ViewHolder>() {


    override fun onCreateViewHolder(


        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val resId = if (viewType == 1) R.layout.item_view1 else R.layout.item_view2
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(resId, parent, false)
        )
    }

    override fun getItemCount() = data.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        when (getItemViewType(position)) {

            1 -> holder.bind(data[position] as Birinchi)
            2 -> holder.bind(data[position] as Ikkinchi)
        }


    }

    override fun getItemViewType(position: Int) = data[position].getType()


    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {
        fun bind(d: Birinchi) {

            itemView.apply {

                rasm.setImageResource(d.image)
                text1.text = d.date
                text2.text = d.price

            }


        }

        fun bind(d: Ikkinchi) {

            itemView.apply {
                image.setImageResource(d.rasm)
                text3.text = d.sana
                text4.text = d.narx


            }

        }

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {

            val position: Int = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }
        }

    }

    interface OnItemClickListener {

        fun onItemClick(position: Int)
    }
}