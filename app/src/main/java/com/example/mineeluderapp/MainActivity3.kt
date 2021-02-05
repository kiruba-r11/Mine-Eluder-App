package com.example.mineeluderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import cellsUncovered
import gridSide
import kotlinx.android.synthetic.main.activity_main3.*
import noOfMines
import placeMine
import score
import kotlin.math.round

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var arrayOfButtons = arrayOf(
                arrayOf(button1 , button2 , button3 , button4 , button5 , button6 , button7 , button8 , button9) ,
                arrayOf(button10 , button11 , button12 , button13 , button14 , button15 , button16 , button17 , button18) ,
                arrayOf(button19 , button20 , button21 , button22 , button23 , button24 , button25 , button26 , button27) ,
                arrayOf(button28 , button29 , button30 , button31 , button32 , button33 , button34 , button35 , button36) ,
                arrayOf(button37 , button38 , button39 , button40 , button41 , button42 , button43 , button44 , button45) ,
                arrayOf(button46 , button47 , button48 , button49 , button50 , button51 , button52 , button53 , button54) ,
                arrayOf(button55 , button56 , button57 , button58 , button59 , button60 , button61 , button62 , button63) ,
                arrayOf(button64 , button65 , button66 , button67 , button68 , button69 , button70 , button71 , button72) ,
                arrayOf(button73 , button74 , button75 , button76 , button77 , button78 , button79 , button80 , button81)
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
        arrayOfButtons[0][5].setOnClickListener {
            makeMove(arrayOfButtons , mines , 0 , 5)
        }
        arrayOfButtons[0][6].setOnClickListener {
            makeMove(arrayOfButtons , mines , 0 , 6)
        }
        arrayOfButtons[0][7].setOnClickListener {
            makeMove(arrayOfButtons , mines , 0 , 7)
        }
        arrayOfButtons[0][8].setOnClickListener {
            makeMove(arrayOfButtons , mines , 0 , 8)
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

        arrayOfButtons[1][7].setOnClickListener {
            makeMove(arrayOfButtons , mines , 1 , 7)
        }
        arrayOfButtons[1][8].setOnClickListener {
            makeMove(arrayOfButtons , mines , 1 , 8)
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

        arrayOfButtons[2][7].setOnClickListener {
            makeMove(arrayOfButtons , mines , 2 , 7)
        }
        arrayOfButtons[2][8].setOnClickListener {
            makeMove(arrayOfButtons , mines , 2 , 8)
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

        arrayOfButtons[3][7].setOnClickListener {
            makeMove(arrayOfButtons , mines , 3 , 7)
        }
        arrayOfButtons[3][8].setOnClickListener {
            makeMove(arrayOfButtons , mines , 3 , 8)
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

        arrayOfButtons[4][7].setOnClickListener {
            makeMove(arrayOfButtons , mines , 4 , 7)
        }
        arrayOfButtons[4][8].setOnClickListener {
            makeMove(arrayOfButtons , mines , 4 , 8)
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

        arrayOfButtons[5][7].setOnClickListener {
            makeMove(arrayOfButtons , mines , 5 , 7)
        }
        arrayOfButtons[5][8].setOnClickListener {
            makeMove(arrayOfButtons , mines , 5 , 8)
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

        arrayOfButtons[6][7].setOnClickListener {
            makeMove(arrayOfButtons , mines , 6 , 7)
        }
        arrayOfButtons[6][8].setOnClickListener {
            makeMove(arrayOfButtons , mines , 6 , 8)
        }

        arrayOfButtons[7][0].setOnClickListener {
            makeMove(arrayOfButtons , mines , 7 , 0)
        }
        arrayOfButtons[7][1].setOnClickListener {
            makeMove(arrayOfButtons , mines , 7 , 1)
        }
        arrayOfButtons[7][2].setOnClickListener {
            makeMove(arrayOfButtons , mines , 7 , 2)
        }
        arrayOfButtons[7][3].setOnClickListener {
            makeMove(arrayOfButtons , mines , 7 , 3)
        }
        arrayOfButtons[7][4].setOnClickListener {
            makeMove(arrayOfButtons , mines , 7 , 4)
        }
        arrayOfButtons[7][5].setOnClickListener {
            makeMove(arrayOfButtons , mines , 7 , 5)
        }
        arrayOfButtons[7][6].setOnClickListener {
            makeMove(arrayOfButtons , mines , 7 , 6)
        }
        arrayOfButtons[7][7].setOnClickListener {
            makeMove(arrayOfButtons , mines , 7 , 7)
        }
        arrayOfButtons[7][8].setOnClickListener {
            makeMove(arrayOfButtons , mines , 7 , 8)
        }

        arrayOfButtons[8][0].setOnClickListener {
            makeMove(arrayOfButtons , mines , 8 , 0)
        }
        arrayOfButtons[8][1].setOnClickListener {
            makeMove(arrayOfButtons , mines , 8 , 1)
        }
        arrayOfButtons[8][2].setOnClickListener {
            makeMove(arrayOfButtons , mines , 8 , 2)
        }
        arrayOfButtons[8][3].setOnClickListener {
            makeMove(arrayOfButtons , mines , 8 , 3)
        }
        arrayOfButtons[8][4].setOnClickListener {
            makeMove(arrayOfButtons , mines , 8 , 4)
        }
        arrayOfButtons[8][5].setOnClickListener {
            makeMove(arrayOfButtons , mines , 8 , 5)
        }
        arrayOfButtons[8][6].setOnClickListener {
            makeMove(arrayOfButtons , mines , 8 , 6)
        }
        arrayOfButtons[8][7].setOnClickListener {
            makeMove(arrayOfButtons , mines , 8 , 7)
        }
        arrayOfButtons[8][8].setOnClickListener {
            makeMove(arrayOfButtons , mines , 8 , 8)
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