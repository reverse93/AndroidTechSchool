package com.example.tourapprecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SopotCity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sopot_city)
            Toast.makeText(this, "HELLO SOPOT", Toast.LENGTH_SHORT).show()
        val SopotData = CityData(getString(R.string.Sopot),
            getString(R.string.sopot_description),
            R.drawable.sopot)
        Toast.makeText(this, "DEBUG POINT" + SopotData.Name, Toast.LENGTH_SHORT).show()
        val SopotAdapter = CityAdapter(arrayOf(SopotData))
        val recViewSopotCity = findViewById<RecyclerView>(R.id.sopot_rec_view)
        val manager = LinearLayoutManager(this)
        recViewSopotCity.setLayoutManager(manager)
        recViewSopotCity.adapter = SopotAdapter
    }
}