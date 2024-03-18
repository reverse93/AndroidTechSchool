package com.example.tourapprecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class CityAdapter(val City:Array<CityData>):RecyclerView.Adapter<CityAdapter.ViewHolder>() {
    class ViewHolder(v: View):RecyclerView.ViewHolder(v){
        val CityName: TextView
        val CityDescription : TextView
        val CityImage: ImageView
        init {
            CityName = v.findViewById<TextView>(R.id.CityName)
            CityDescription = v.findViewById<TextView>(R.id.CityDescription)
            CityImage = v.findViewById<ImageView>(R.id.CityImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.details_city, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return City.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        println(City[position].Name + " " + City[position].Description)
        holder.CityName.text = City[position].Name
        holder.CityDescription.text = City[position].Description
        holder.CityImage.setImageResource(City[position].image)

    }

}