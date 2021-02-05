import kotlin.random.Random

var difficultyLevel = 0
var gridSide = 0
var noOfMines = 0
var cellsUncovered = 0
var score = 0.0

fun placeMine(): ArrayList <ArrayList <Int>> {

    var minesProbability = when (difficultyLevel) {
        1 -> 0.20
        2 -> 0.30
        else -> 0.40
    }

    gridSide = when (difficultyLevel) {
        1 -> 5
        2 -> 7
        else -> 9
    }

    noOfMines = kotlin.math.ceil(minesProbability * gridSide * gridSide).toInt()
    var mines = ArrayList <ArrayList <Int>> ()
    var mark: ArrayList <Int> = ArrayList <Int> (gridSide * gridSide)

    var i = 1
    while(i <= noOfMines) {
        var random: Int = Random.nextInt(0 , gridSide * gridSide)
        var row: Int = random / gridSide
        var column: Int = random % gridSide

        if(!mark.contains(random)) {
            mines.add(arrayListOf(row + 1 , column + 1))
            mark.add(random)
            i++
        }
    }
    return mines
}





