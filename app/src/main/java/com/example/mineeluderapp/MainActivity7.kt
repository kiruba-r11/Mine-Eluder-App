package com.example.mineeluderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cellsUncovered
import kotlinx.android.synthetic.main.activity_main7.*
import score

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        totalCellsUncovered.append(cellsUncovered.toString())
        totalScore.append(score.toString())
        performance.append(
            if(score <= 30.0)
                "BAD"
            else if(score <= 60.0)
                "GOOD"
            else
                "EXCELLENT"
        )

        mainMenuButton.setOnClickListener {
            val i = Intent(this , MainActivity::class.java)
            startActivity(i)
        }
    }
}