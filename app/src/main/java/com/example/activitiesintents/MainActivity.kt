package com.example.activitiesintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val greenButton = findViewById<Button>(R.id.greenButton)
        val purpleButton = findViewById<Button>(R.id.purpleButton)

        greenButton.setOnClickListener {
            val intent = Intent(this, GreenActivity::class.java)
            val myText = findViewById<EditText>(R.id.myText)

            intent.putExtra("myKey", "${myText.text}")
            startActivity(intent)

        }

        purpleButton.setOnClickListener {
            val intent = Intent(this, NextActivity::class.java)
            startActivity(intent)

        }
    }
}