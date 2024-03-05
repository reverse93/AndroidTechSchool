package com.example.paczka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast


class RodzajPrzesylkiActivity : AppCompatActivity() {
    var nazwaPrzesylki: String = ""
    var kwota: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rodzaj_przesylki)
        var zapiszPrzesylke : Button = findViewById(R.id.zapiszPrzesylke)
        var sprawdzCene : Button = findViewById(R.id.sprawdz)
        var cenaPrint : TextView = findViewById(R.id.textView)
        var radioGroup: RadioGroup? = null
        radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        println(radioGroup)

        zapiszPrzesylke.setOnClickListener {
            if (kwota != 0) {
                val powrotDoMenu: Intent = Intent(this, MainActivity::class.java)
                powrotDoMenu.putExtra("nazwaPrzesylki", nazwaPrzesylki)
                powrotDoMenu.putExtra("kwota", kwota.toString())
                startActivity(powrotDoMenu)
            }
            else {
                Toast.makeText(this, "Wybierz rodzaj przesyłki", Toast.LENGTH_SHORT).show()
            }
        }

        sprawdzCene.setOnClickListener {
            cenaPrint.setText(kwota.toString() + " zł")
        }

        radioGroup.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener{ group, checkedId ->
            val radio:RadioButton = findViewById(checkedId)
                when(radio.text) {
                    "Pocztówka" -> selectPackageFunction("pocztowkaBox")
                    "List" -> selectPackageFunction("listBox")
                    "Paczka" -> selectPackageFunction("PaczkaBox")
                }
            })
    }

    fun selectPackageFunction(imagePackage: String)
    {
        var ImagePackagePhoto = findViewById<ImageView>(R.id.typPaczki)
        if(imagePackage == "pocztowkaBox")
        {
            ImagePackagePhoto.setImageResource(R.drawable.pocztowka)
            kwota = 1
        }
        else  if(imagePackage == "listBox")
        {
            ImagePackagePhoto.setImageResource(R.drawable.list)
            kwota = 1
        }
        else  if(imagePackage == "PaczkaBox")
        {
            ImagePackagePhoto.setImageResource(R.drawable.paczka)
            kwota = 10
        }


    }
}

private fun RadioGroup?.setOnCheckedChangeListener() {
    TODO("Not yet implemented")
}
