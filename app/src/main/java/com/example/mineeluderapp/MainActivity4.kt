package com.example.mineeluderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main4.*
import difficultyLevel

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        newbieButton.setOnClickListener {
            val i = Intent(this , MainActivity5::class.java)
            difficultyLevel = 1
            startActivity(i)
        }

        specialistButton.setOnClickListener {
            val i = Intent(this , MainActivity2::class.java)
            difficultyLevel = 2
            startActivity(i)
        }

        masterButton.setOnClickListener {
            val i = Intent(this , MainActivity3::class.java)
            difficultyLevel = 3
            startActivity(i)
        }
    }
}