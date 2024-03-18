package com.example.tourapprecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class GdanskCity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gdansk_city)
        val GdanskData = CityData(getString(R.string.Gdansk),
                                  getString(R.string.gdansk_description),
                                  R.drawable.gdansk)
        val arrayOfDescriptionGdansk = arrayOf(GdanskData)
        val GdanskAdapter = CityAdapter(arrayOfDescriptionGdansk)
        val recViewGdanskCity = findViewById<RecyclerView>(R.id.gdansk_rec_view)
        val manager = LinearLayoutManager(this)
        recViewGdanskCity.setLayoutManager(manager)
        recViewGdanskCity.adapter= GdanskAdapter
    }
}