package com.example.countactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView : TextView = findViewById(R.id.textView)
        val button : Button = findViewById(R.id.button)
        val button2 : Button = findViewById(R.id.button2)
        var i:Int =0

        button.setOnClickListener{
            i++
            textView.text=i.toString()
        }
        button2.setOnClickListener{
            i--
            textView.text=i.toString()
        }

    }

}