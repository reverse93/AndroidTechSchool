package com.example.tourapprecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GdyniaCity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gdynia_city)
        val GdyniaData = CityData(getString(R.string.Gdynia),
            getString(R.string.gdynia_description),
            R.drawable.gdynia)
        val GdyniaAdapter = CityAdapter(arrayOf(GdyniaData))
        val recViewGdyniaCity = findViewById<RecyclerView>(R.id.gdynia_rec_view)
        val manager = LinearLayoutManager(this)
        recViewGdyniaCity.setLayoutManager(manager)
        recViewGdyniaCity.setAdapter(GdyniaAdapter)
    }
}