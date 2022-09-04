package com.gridness.iqtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val defaultScore = 50
        val startBtn: Button = findViewById(R.id.startBtn)
        startBtn.setOnClickListener {
            val intent = Intent(this, FirstQuestion::class.java).apply {
                putExtra("username", rememberName())
                putExtra("score", defaultScore)
            }
            startActivity(intent)
        }
    }

    private fun rememberName(): String {
        var name = findViewById<EditText>(R.id.firstName).text.toString()
        if (name == "") {
            name = "Аноним"
        }
        return name
    }
}