package com.gridness.iqtest

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Result : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        supportActionBar?.hide()

        val usernameView = findViewById<TextView>(R.id.nameView).setText(intent.getStringExtra("username"))
        val iqview = findViewById<TextView>(R.id.iqView).setText(intent.getIntExtra("score", -1).toString() + " IQ")
        val iqLevelView = findViewById<TextView>(R.id.iqLevelView).setText(determineIQLevel())
        val restartButton = findViewById<Button>(R.id.button9)
        restartButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                removeExtra("username")
                removeExtra("score")
            }
            startActivity(intent)
        }
    }

    private fun determineIQLevel(): String {
        val score = intent.getIntExtra("score", -1)
        if (score < 0) {
            return "игрок в DOTA 2"
        } else if (score < 50) {
            return "хлебный мякиш"
        } else if (score < 100) {
            return "резиновый тапочек"
        }

        return "Альберт Эйнштейн"
    }
}