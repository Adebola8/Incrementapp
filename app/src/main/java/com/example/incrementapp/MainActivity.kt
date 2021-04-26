package com.example.incrementapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var plus = findViewById<Button>(R.id.increment_button)
        var text = findViewById<TextView>(R.id.increment_tv)
        var count = 0

        plus.setOnClickListener{
            count++

            text.text = count.toString()

        }





    }
}