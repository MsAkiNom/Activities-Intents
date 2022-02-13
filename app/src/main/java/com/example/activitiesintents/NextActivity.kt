package com.example.activitiesintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val purpleDone = findViewById<Button>(R.id.purpleDone)
        purpleDone.setOnClickListener {
            finish()
        }

    }
}