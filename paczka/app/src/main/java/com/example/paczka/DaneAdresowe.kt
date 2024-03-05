package com.example.paczka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class DaneAdresowe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dane_adresowe)

        val zapisz : Button = findViewById(R.id.zapisz)
        val txtUlica : TextView = findViewById(R.id.daneAdresowe)
        val txtKodPocztowy: TextView = findViewById(R.id.kodPocztowy)
        zapisz.setOnClickListener {
            if (txtUlica.text != "" && txtKodPocztowy.text != "")
            {
                val powrotDoMenu: Intent = Intent(this, MainActivity::class.java)
                powrotDoMenu.putExtra("txtUlica", txtUlica.toString())
                powrotDoMenu.putExtra("txtKodPocztowy", txtKodPocztowy.toString())
                startActivity(powrotDoMenu)
            }
            else{
                Toast.makeText(this, "Podaj prawidłowe dane", Toast.LENGTH_SHORT).show()
            }
        }
    }
}