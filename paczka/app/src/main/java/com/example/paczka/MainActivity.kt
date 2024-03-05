package com.example.paczka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kwotaZamowienia: TextView = findViewById(R.id.kwotaZamowienia)
        val adresWysylki: TextView = findViewById(R.id.adresWysylki)

        var getPackageName = intent.getStringExtra("nazwaPrzesylki")
        var getPacketPrice = intent.getStringExtra("kwota")
        var getNameStreet = intent.getStringExtra("txtUlica")
        var getCode = intent.getStringExtra("txtKodPocztowy")

        adresWysylki.text = "\n" + getNameStreet + "\n" + getCode
        kwotaZamowienia.setText("Kwota zamówienia: " + getPacketPrice + " zł")
        val rodzaj_przesylki = findViewById<Button>(R.id.rodzajPrzesylki)
        rodzaj_przesylki.setOnClickListener {
            val rodzajPrzesylkiIntent: Intent = Intent(this, RodzajPrzesylkiActivity::class.java)
            startActivity(rodzajPrzesylkiIntent)
        }
        val dane_adresowe = findViewById<Button>(R.id.daneAdresowe)
        dane_adresowe.setOnClickListener {
            val daneAdresoweIntent: Intent = Intent(this, DaneAdresowe::class.java)
            startActivity(daneAdresoweIntent)
        }
    }
}