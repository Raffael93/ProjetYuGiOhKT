package com.example.yugikt.Model.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.yugikt.Model.Data.Card
import androidx.recyclerview.widget.RecyclerView
import com.example.yugikt.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.layout_item.view.*

class CardAdapter (private val context: Context, private val cardList: MutableList<Card>) : RecyclerView.Adapter<CardAdapter.MyViewHolder>(){

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var image: ImageView
        var name : TextView
        var desc : TextView

        init {
            image = itemView.image_card
            name = itemView.name
            desc = itemView.desc
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.layout_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return cardList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        Picasso.get().load(cardList[position].url).into(holder.image)
        holder.name.text = cardList[position].name
        holder.desc.text = cardList[position].desc

    }


}