package com.gridness.iqtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstQuestion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_question)
        supportActionBar?.hide()

        val name = intent.getStringExtra("username")
        val currentScore = intent.getIntExtra("score", -1)

        val wrongAnswerOne = findViewById<Button>(R.id.button)
        wrongAnswerOne.setOnClickListener {
            val newScore = currentScore + defineValue("wrong")
            val intent = Intent(this, SecondQuestion::class.java).apply {
                removeExtra("score")
                putExtra("score", newScore)
                putExtra("username", name)
            }
            startActivity(intent)
        }
        val wrongAnswerTwo = findViewById<Button>(R.id.button2)
        wrongAnswerTwo.setOnClickListener {
            val newScore = currentScore + defineValue("wrong")
            val intent = Intent(this, SecondQuestion::class.java).apply {
                removeExtra("score")
                putExtra("score", newScore)
                putExtra("username", name)
            }
            startActivity(intent)
        }
        val wrongAnswerThree = findViewById<Button>(R.id.button3)
        wrongAnswerThree.setOnClickListener {
            val newScore = currentScore + defineValue("wrong")
            val intent = Intent(this, SecondQuestion::class.java).apply {
                removeExtra("score")
                putExtra("score", newScore)
                putExtra("username", name)
            }
            startActivity(intent)
        }
        val wrongAnswerFour = findViewById<Button>(R.id.button5)
        wrongAnswerFour.setOnClickListener {
            val newScore = currentScore + defineValue("wrong")
            val intent = Intent(this, SecondQuestion::class.java).apply {
                removeExtra("score")
                putExtra("score", newScore)
                putExtra("username", name)
            }
            startActivity(intent)
        }
        val rightAnswer = findViewById<Button>(R.id.button4)
        rightAnswer.setOnClickListener {
            val newScore = currentScore + defineValue("right")
            val intent = Intent(this, SecondQuestion::class.java).apply {
                removeExtra("score")
                putExtra("score", newScore)
                putExtra("username", name)
            }
            startActivity(intent)
        }
    }

    private fun defineValue(answer: String): Int {
        val modifier = 25
        if (answer == "wrong") {
            return modifier - 2 * modifier
        }

        return modifier
    }
}