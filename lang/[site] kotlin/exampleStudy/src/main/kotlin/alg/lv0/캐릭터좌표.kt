package alg.lv0

import kotlin.math.abs


class C(
    private var boardX: Int,
    private var boardY: Int,
    private var x: Int = 0,
    private var y: Int = 0
) {
    init {
        this.boardX = boardX.div(2)
        this.boardY = boardY.div(2)
    }

    fun move(s: String) {
        when (s) {
            "right" -> moveRight()
            "left" -> moveLeft()
            "up" -> moveUp()
            "down" -> moveDown()
        }
    }

    private fun moveUp() {
        if (abs(boardY) >= abs(this.y + 1)) {
            this.y = this.y + 1
        }
    }

    private fun moveDown() {
        if (abs(boardY) >= abs(this.y - 1)) {
            this.y = this.y - 1
        }
    }

    private fun moveRight() {
        if (abs(boardX) >= abs(this.x + 1)) {
            this.x = this.x + 1
        }
    }

    private fun moveLeft() {
        if (abs(boardX) >= abs(this.x - 1)) {
            this.x = this.x - 1
        }
    }

    fun position(): IntArray {
        return intArrayOf(this.x, this.y)
    }
}

class 캐릭터좌표 {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {

        var c = C(board[0], board[1])
        for (s in keyinput) {
            c.move(s)
        }
        return c.position()
    }
}

fun main() {
    var s = 캐릭터좌표()
    println(
        s.solution(
            arrayOf("left", "right", "up", "right", "right"),
            intArrayOf(11, 11)
        ).contentEquals(intArrayOf(2, 1))
    )
    println(
        s.solution(
            arrayOf("down", "down", "down", "down", "down"),
            intArrayOf(7, 9)
        ).contentEquals(intArrayOf(0, -4))
    )
//        println(s.solution(arrayOf("left", "right", "up", "right", "right"), intArrayOf(11, 11)))
//    println(s.solution(arrayOf("down", "down", "down", "down", "down"), intArrayOf(7, 9)))
}