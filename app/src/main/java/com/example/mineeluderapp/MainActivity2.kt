package com.example.mineeluderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import cellsUncovered
import gridSide
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.button1
import kotlinx.android.synthetic.main.activity_main2.button10
import kotlinx.android.synthetic.main.activity_main2.button11
import kotlinx.android.synthetic.main.activity_main2.button12
import kotlinx.android.synthetic.main.activity_main2.button13
import kotlinx.android.synthetic.main.activity_main2.button14
import kotlinx.android.synthetic.main.activity_main2.button15
import kotlinx.android.synthetic.main.activity_main2.button16
import kotlinx.android.synthetic.main.activity_main2.button17
import kotlinx.android.synthetic.main.activity_main2.button18
import kotlinx.android.synthetic.main.activity_main2.button19
import kotlinx.android.synthetic.main.activity_main2.button2
import kotlinx.android.synthetic.main.activity_main2.button20
import kotlinx.android.synthetic.main.activity_main2.button21
import kotlinx.android.synthetic.main.activity_main2.button22
import kotlinx.android.synthetic.main.activity_main2.button23
import kotlinx.android.synthetic.main.activity_main2.button24
import kotlinx.android.synthetic.main.activity_main2.button25
import kotlinx.android.synthetic.main.activity_main2.button3
import kotlinx.android.synthetic.main.activity_main2.button4
import kotlinx.android.synthetic.main.activity_main2.button5
import kotlinx.android.synthetic.main.activity_main2.button6
import kotlinx.android.synthetic.main.activity_main2.button7
import kotlinx.android.synthetic.main.activity_main2.button8
import kotlinx.android.synthetic.main.activity_main2.button9
import kotlinx.android.synthetic.main.activity_main2.nextButton
import kotlinx.android.synthetic.main.activity_main2.scoreTextView
import noOfMines
import placeMine
import score
import kotlin.math.round

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var arrayOfButtons = arrayOf(
            arrayOf(button1 , button2 , button3 , button4 , button5 , button6 , button7) ,
            arrayOf(button8 , button9 , button10 , button11 , button12 , button13 , button14) ,
            arrayOf(button15 , button16 , button17 , button18 , button19 , button20 , button21) ,
            arrayOf(button22 , button23 , button24 , button25 , button26 , button27 , button28) ,
            arrayOf(button29 , button30 , button31 , button32 , button33 , button34 , button35) ,
            arrayOf(button36 , button37 , button38 , button39 , button40 , button41 , button42) ,
            arrayOf(button43 , button44 , button45 , button46 , button47 , button48 , button49)
        )

        var mines = placeMine()

        cellsUncovered = 0
        score = 0.0

        if(validCheatCode) {
            switchSpecialist.visibility = View.VISIBLE
            switchSpecialist.setOnCheckedChangeListener { buttonView, isChecked ->
                if(isChecked) {
                    printMine(arrayOfButtons , mines)
                }
                else {
                    unPrintMine(arrayOfButtons , mines)
                }
            }
        }

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
        arrayOfButtons[0][5].setOnClickListener {
            makeMove(arrayOfButtons , mines , 0 , 5)
        }
        arrayOfButtons[0][6].setOnClickListener {
            makeMove(arrayOfButtons , mines , 0 , 6)
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
        arrayOfButtons[1][5].setOnClickListener {
            makeMove(arrayOfButtons , mines , 1 , 5)
        }
        arrayOfButtons[1][6].setOnClickListener {
            makeMove(arrayOfButtons , mines , 1 , 6)
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
        arrayOfButtons[2][5].setOnClickListener {
            makeMove(arrayOfButtons , mines , 2 , 5)
        }
        arrayOfButtons[2][6].setOnClickListener {
            makeMove(arrayOfButtons , mines , 2 , 6)
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
        arrayOfButtons[3][5].setOnClickListener {
            makeMove(arrayOfButtons , mines , 3 , 5)
        }
        arrayOfButtons[3][6].setOnClickListener {
            makeMove(arrayOfButtons , mines , 3 , 6)
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
        arrayOfButtons[4][5].setOnClickListener {
            makeMove(arrayOfButtons , mines , 4 , 5)
        }
        arrayOfButtons[4][6].setOnClickListener {
            makeMove(arrayOfButtons , mines , 4 , 6)
        }

        arrayOfButtons[5][0].setOnClickListener {
            makeMove(arrayOfButtons , mines , 5 , 0)
        }
        arrayOfButtons[5][1].setOnClickListener {
            makeMove(arrayOfButtons , mines , 5 , 1)
        }
        arrayOfButtons[5][2].setOnClickListener {
            makeMove(arrayOfButtons , mines , 5 , 2)
        }
        arrayOfButtons[5][3].setOnClickListener {
            makeMove(arrayOfButtons , mines , 5 , 3)
        }
        arrayOfButtons[5][4].setOnClickListener {
            makeMove(arrayOfButtons , mines , 5 , 4)
        }
        arrayOfButtons[5][5].setOnClickListener {
            makeMove(arrayOfButtons , mines , 5 , 5)
        }
        arrayOfButtons[5][6].setOnClickListener {
            makeMove(arrayOfButtons , mines , 5 , 6)
        }

        arrayOfButtons[6][0].setOnClickListener {
            makeMove(arrayOfButtons , mines , 6 , 0)
        }
        arrayOfButtons[6][1].setOnClickListener {
            makeMove(arrayOfButtons , mines , 6 , 1)
        }
        arrayOfButtons[6][2].setOnClickListener {
            makeMove(arrayOfButtons , mines , 6 , 2)
        }
        arrayOfButtons[6][3].setOnClickListener {
            makeMove(arrayOfButtons , mines , 6 , 3)
        }
        arrayOfButtons[6][4].setOnClickListener {
            makeMove(arrayOfButtons , mines , 6 , 4)
        }
        arrayOfButtons[6][5].setOnClickListener {
            makeMove(arrayOfButtons , mines , 6 , 5)
        }
        arrayOfButtons[6][6].setOnClickListener {
            makeMove(arrayOfButtons , mines , 6 , 6)
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

    private fun printMine(arrayOfButtons: Array <Array <Button>>, mines: ArrayList <ArrayList <Int>>) {
        for(index in mines.indices) {
            arrayOfButtons[mines[index][0] - 1][mines[index][1] - 1].text = "-"
        }
    }

    private fun unPrintMine(arrayOfButtons: Array <Array <Button>> , mines: ArrayList <ArrayList <Int>>) {
        for(index in mines.indices) {
            arrayOfButtons[mines[index][0] - 1][mines[index][1] - 1].text = ""
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