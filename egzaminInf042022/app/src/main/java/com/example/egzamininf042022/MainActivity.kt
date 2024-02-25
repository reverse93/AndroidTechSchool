package com.example.egzamininf042022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.security.KeyStore.TrustedCertificateEntry

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var podsumowanie = findViewById<TextView>(R.id.komunikat)
        var podajHaslo = findViewById<EditText>(R.id.podajHaslo)
        var powtorzHaslo = findViewById<EditText>(R.id.powtorzHaslo)
        var email = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val zatwierdz = findViewById<Button>(R.id.zatwierdzPrzycisk)

        zatwierdz.setOnClickListener {
            podsumowanie.setText(CheckWords(email.getText().toString(), podajHaslo.getText().toString(), powtorzHaslo.getText().toString()))
        }
    }
    fun CheckWords (email: String, pasword: String, repeatedPassword: String) : String
    {
        var messageToPrint : String = ""
        if (IsEmailConainDot(email))
        {
            if (pasword == repeatedPassword)
            {
                messageToPrint = "Witaj " + email
            }
            else
            {
                messageToPrint = "Hasła się różnią"
            }
        }
        else
        {
            messageToPrint = "Nieprawidłowy adres e-mail"
        }
        return messageToPrint
    }
    fun IsEmailConainDot(email: String): Boolean {
        if (email.contains("@"))
        {
            return true
        }
        else {
            return false
        }
    }
}