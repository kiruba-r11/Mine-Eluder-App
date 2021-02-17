package com.example.mineeluderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main8.*

var validCheatCode = false

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        useItButton.setOnClickListener {
            neglectItButton.isEnabled = false
            useItButton.isEnabled = false
            cheatCodeEditText.visibility = View.VISIBLE
            startButton.visibility = View.VISIBLE
            startButton.setOnClickListener {
                val cheatCode = cheatCodeEditText.text.toString()
                validCheatCode = isCheatCodeValid(cheatCode)
                if(validCheatCode) {
                    Toast.makeText(this , "Wow! Your Cheat Code is right", Toast.LENGTH_SHORT).show()
                }
                else {
                    Toast.makeText(this , "Oops! Your Cheat Code is wrong, so you should play without it", Toast.LENGTH_SHORT).show()
                }
                val i = Intent(this , MainActivity4::class.java)
                startActivity(i)
            }
        }

        neglectItButton.setOnClickListener {
            validCheatCode = false
            startButton.visibility = View.VISIBLE
            neglectItButton.isEnabled = false
            useItButton.isEnabled = false
            Toast.makeText(this , "Nice! Your honestly is appreciated", Toast.LENGTH_SHORT).show()
            startButton.setOnClickListener{
                val i = Intent(this , MainActivity4::class.java)
                startActivity(i)
            }
        }
    }

    private fun isCheatCodeValid(cheatCode: String): Boolean {
        if(cheatCode == "revealMines")
            return true
        return false
    }
}