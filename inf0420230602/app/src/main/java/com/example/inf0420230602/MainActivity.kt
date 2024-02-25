package com.example.inf0420230602

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val welcomeSigns = arrayOf("Dzień dobry", "Good morning", "Buenos dias")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val seekBarChangeText = findViewById<SeekBar>(R.id.seekBar3)
        var textSizeFont = findViewById<TextView>(R.id.switchTextField)
        val btn = findViewById<Button>(R.id.switchText)
        seekBarChangeText?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                Toast.makeText(this@MainActivity, p0?.progress.toString(), Toast.LENGTH_LONG).show()
                p0?.getProgress()?.toFloat()
                    ?.let { textSizeFont.setTextSize(TypedValue.COMPLEX_UNIT_SP, it) }
            }
        })

        btn.setOnClickListener {
            textSizeFont.setText(getNextElementFromTable(textSizeFont.getText().toString()))
        }
    }

    fun getNextElementFromTable(textFromApp: String): String
    {
        var greetingsToReturn: String = ""
        for(index in welcomeSigns.indices)
        {
            if(welcomeSigns[index] == textFromApp)
            {
                if ( index == welcomeSigns.size - 1 ) {
                    greetingsToReturn = welcomeSigns[0]
                }
                else {
                    greetingsToReturn = welcomeSigns[index + 1]

                }
            }
        }
        return greetingsToReturn
    }
}


