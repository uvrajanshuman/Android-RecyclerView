package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter(val fruit: ArrayList<Fruit>):RecyclerView.Adapter<FruitAdapter.FruitViewHolder>(){

    class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val fruitName: TextView = itemView.findViewById(R.id.tvFruitName)
        val origin : TextView = itemView.findViewById(R.id.tvFruitOrigin)
        val quantity : TextView = itemView.findViewById(R.id.tvFruitQuantity)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
//        val context= parent.context
//        val inflater = LayoutInflater.from(context)
//        val FruitView = inflater.inflate(R.layout.list_item,parent,false)
        val fruitView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return FruitViewHolder(fruitView)
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        val currentItem = fruit[position]
        holder.fruitName.text = currentItem.name
        holder.origin.text = currentItem.origin
        holder.quantity.text = currentItem.quantity.toString()
    }

    override fun getItemCount(): Int {
        return fruit.size
    }
}