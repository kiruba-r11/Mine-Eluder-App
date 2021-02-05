package com.example.mineeluderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import gridSide
import kotlinx.android.synthetic.main.activity_main.*
import noOfMines
import cellsUncovered
import score
import placeMine
import kotlin.math.round

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arrayOfButtons = arrayOf(
                arrayOf(button1 , button2 , button3 , button4 , button5) ,
                arrayOf(button6 , button7 , button8 , button9 , button10) ,
                arrayOf(button11 , button12 , button13 , button14 , button15) ,
                arrayOf(button16 , button17 , button18 , button19 , button20) ,
                arrayOf(button21 , button22 , button23 , button24 , button25)
        )

        var mines = placeMine()

        cellsUncovered = 0
        score = 0.0

//        printMine(arrayOfButtons , mines)

        arrayOfButtons[0][0].setOnClickListener {
            makeMove(arrayOfButtons , mines , 0 , 0)
        }
        arrayOfButtons[0][1].setOnClickListener {
            makeMove(arrayOfButtons , mines , 0 , 1)
        }
        arrayOfButtons[0][2].setOnClickListener {
            makeMove(arrayOfButtons , mines , 0 , 2)
        }
        arrayOfButtons[0][3].setOnClickListener {
            makeMove(arrayOfButtons , mines , 0 , 3)
        }
        arrayOfButtons[0][4].setOnClickListener {
            makeMove(arrayOfButtons , mines , 0 , 4)
        }

        arrayOfButtons[1][0].setOnClickListener {
            makeMove(arrayOfButtons , mines , 1 , 0)
        }
        arrayOfButtons[1][1].setOnClickListener {
            makeMove(arrayOfButtons , mines , 1 , 1)
        }
        arrayOfButtons[1][2].setOnClickListener {
            makeMove(arrayOfButtons , mines , 1 , 2)
        }
        arrayOfButtons[1][3].setOnClickListener {
            makeMove(arrayOfButtons , mines , 1 , 3)
        }
        arrayOfButtons[1][4].setOnClickListener {
            makeMove(arrayOfButtons , mines , 1 , 4)
        }

        arrayOfButtons[2][0].setOnClickListener {
            makeMove(arrayOfButtons , mines , 2 , 0)
        }
        arrayOfButtons[2][1].setOnClickListener {
            makeMove(arrayOfButtons , mines , 2 , 1)
        }
        arrayOfButtons[2][2].setOnClickListener {
            makeMove(arrayOfButtons , mines , 2 , 2)
        }
        arrayOfButtons[2][3].setOnClickListener {
            makeMove(arrayOfButtons , mines , 2 , 3)
        }
        arrayOfButtons[2][4].setOnClickListener {
            makeMove(arrayOfButtons , mines , 2 , 4)
        }

        arrayOfButtons[3][0].setOnClickListener {
            makeMove(arrayOfButtons , mines , 3 , 0)
        }
        arrayOfButtons[3][1].setOnClickListener {
            makeMove(arrayOfButtons , mines , 3 , 1)
        }
        arrayOfButtons[3][2].setOnClickListener {
            makeMove(arrayOfButtons , mines , 3 , 2)
        }
        arrayOfButtons[3][3].setOnClickListener {
            makeMove(arrayOfButtons , mines , 3 , 3)
        }
        arrayOfButtons[3][4].setOnClickListener {
            makeMove(arrayOfButtons , mines , 3 , 4)
        }

        arrayOfButtons[4][0].setOnClickListener {
            makeMove(arrayOfButtons , mines , 4 , 0)
        }
        arrayOfButtons[4][1].setOnClickListener {
            makeMove(arrayOfButtons , mines , 4 , 1)
        }
        arrayOfButtons[4][2].setOnClickListener {
            makeMove(arrayOfButtons , mines , 4 , 2)
        }
        arrayOfButtons[4][3].setOnClickListener {
            makeMove(arrayOfButtons , mines , 4 , 3)
        }
        arrayOfButtons[4][4].setOnClickListener {
            makeMove(arrayOfButtons , mines , 4 , 4)
        }

        nextButton.setOnClickListener {
            val i = Intent(this , MainActivity7::class.java)
            startActivity(i)
        }

    }

    private fun makeMove(arrayOfButtons: Array<Array<Button>>, mines: ArrayList<ArrayList<Int>>, cellRowPosition: Int, cellColumnPosition: Int) {
        if(checkMine(cellRowPosition , cellColumnPosition , mines)) {
            nextButton.visibility = Button.VISIBLE
            disableButtons(arrayOfButtons)
            changeButtonColor(arrayOfButtons , mines)
            Toast.makeText(this , "OOPS! It's a MINE" , Toast.LENGTH_SHORT).show()
        }
        else {
            cellsUncovered++
            disableButtons(arrayOfButtons , cellRowPosition , cellColumnPosition)
            changeButtonColor(arrayOfButtons , cellRowPosition , cellColumnPosition)
        }
        score = calculateScore()
        scoreTextView.text = "SCORE : ${score}"
        if(cellsUncovered == gridSide * gridSide - noOfMines) {
            disableButtons(arrayOfButtons)
            Toast.makeText(this , "WOW! You unlocked all cells" , Toast.LENGTH_SHORT).show()
            nextButton.visibility = Button.VISIBLE
        }
    }

    private fun printMine(arrayOfButtons: Array <Array <Button>> , mines: ArrayList <ArrayList <Int>>) {
        for(index in mines.indices) {
            arrayOfButtons[mines[index][0] - 1][mines[index][1] - 1].text = "M"
        }
    }

    private fun checkMine(cellRowPosition: Int , cellColumnPosition: Int , mines: ArrayList <ArrayList <Int>>): Boolean {
        for(index in mines.indices) {
            if(cellRowPosition == mines[index][0] - 1 && cellColumnPosition == mines[index][1] - 1)
                return true
        }
        return false
    }

    private fun disableButtons(arrayOfButtons: Array<Array<Button>>) {
        for(rowIndex in arrayOfButtons.indices) {
            for(columnIndex in arrayOfButtons[rowIndex].indices) {
                arrayOfButtons[rowIndex][columnIndex].isEnabled = false
            }
        }
    }

    private fun disableButtons(arrayOfButtons: Array<Array<Button>>, cellRowPosition: Int, cellColumnPosition: Int) {
        arrayOfButtons[cellRowPosition][cellColumnPosition].isEnabled = false
    }

    private fun changeButtonColor(arrayOfButtons: Array<Array<Button>>, mines: ArrayList<ArrayList<Int>>) {
        for(index in mines.indices) {
            arrayOfButtons[mines[index][0] - 1][mines[index][1] - 1].setBackgroundColor(resources.getColor(R.color.red))
        }
    }

    private fun changeButtonColor(arrayOfButtons: Array<Array<Button>>, cellRowPosition: Int, cellColumnPosition: Int) {
        arrayOfButtons[cellRowPosition][cellColumnPosition].setBackgroundColor(resources.getColor(R.color.teal1))
    }

    private fun calculateScore(): Double {
        return round((cellsUncovered.toDouble() / (gridSide * gridSide - noOfMines)) * 100)
    }

}