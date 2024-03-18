package com.example.tourapprecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Gdynia = findViewById<TextView>(R.id.Gdynia)
        val Gdansk = findViewById<TextView>(R.id.Gdansk)
        val Sopot = findViewById<TextView>(R.id.Sopot)

        Gdynia.setOnClickListener{
            val GdyniaIntent = Intent(this, GdyniaCity::class.java)
            startActivity(GdyniaIntent)
        }
        Gdansk.setOnClickListener{
            val GdanskIntent = Intent(this, GdanskCity::class.java)
            startActivity(GdanskIntent)
        }
        Sopot.setOnClickListener {
            val SopotIntent = Intent(this, SopotCity::class.java)
            startActivity(SopotIntent)
        }

        val array_of_cities = arrayOf(CityData(getString(R.string.Gdansk), getString(R.string.gdansk_description), R.drawable.gdansk),
                                      CityData(getString(R.string.Gdynia), getString(R.string.gdynia_description), R.drawable.gdynia),
                                      CityData(getString(R.string.Sopot), getString(R.string.sopot_description), R.drawable.sopot))
        val citiesAdapter = CityAdapter(array_of_cities)
        val citiesRecView = findViewById<RecyclerView>(R.id.all_cities)
        val manager = LinearLayoutManager(this)
        citiesRecView.setLayoutManager(manager)
        citiesRecView.adapter = citiesAdapter
    }
}