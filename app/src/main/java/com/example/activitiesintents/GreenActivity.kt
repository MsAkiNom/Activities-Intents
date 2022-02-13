package com.example.activitiesintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class GreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_green)

        val greenDone = findViewById<Button>(R.id.greenDone)
        val myTextView = findViewById<TextView>(R.id.myTextView)
        val thatText = intent.getStringExtra("myKey")
        myTextView.text = thatText
        greenDone.setOnClickListener {
            finish()
        }
    }
}