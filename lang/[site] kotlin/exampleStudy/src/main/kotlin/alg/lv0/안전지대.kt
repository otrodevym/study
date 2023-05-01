package alg.lv0

class 안전지대 {
    fun solution(board: Array<IntArray>): Int {
        var answer: Int = 0
        for ((index1, i) in board.withIndex()) {
            for ((index2, j) in i.withIndex()) {
                if (j == 1) {
                    if (index1 - 1 >= 0 && index2 -1 >= 0) {
                        if (board[index1 - 1][index2 - 1] != 1) {
                            board[index1 -1][index2 -1] = 2
                        }
                    }
                    if (index1 - 1 >= 0) {
                        if (board[index1 -1][index2] != 1) {
                            board[index1 -1][index2] = 2
                        }

                    }
                    if (index1 - 1 >= 0 && index2 + 1 < board.size) {
                        if (board[index1 -1][index2 +1] != 1) {
                            board[index1 -1][index2 +1] = 2
                        }

                    }
                    if (index2 - 1 >= 0) {
                        if (board[index1][index2 -1] != 1) {
                            board[index1][index2 -1] = 2
                        }
                    }
                    if (index2 + 1 < board.size) {
                        if (board[index1][index2 +1] != 1) {
                            board[index1][index2 +1] = 2
                        }
                    }
                    if (index1 + 1 < board.size && index2 - 1 >= 0) {
                        if (board[index1 +1][index2 -1] != 1) {
                            board[index1 +1][index2 -1] = 2
                        }
                    }
                    if (index1 + 1 < board.size) {
                        if (board[index1 +1][index2] != 1) {
                            board[index1 +1][index2] = 2
                        }
                    }
                    if (index1 + 1 < board.size && index2 + 1 < board.size) {
                        if (board[index1 +1][index2 +1] != 1) {
                            board[index1 +1][index2 +1] = 2
                        }
                    }
                }
            }
        }

        return board.let { it.map { v -> v.count { vv -> vv == 0 } }.sumOf { vvv -> vvv } }?: 0
    }
}

fun main() {
    var s = 안전지대()
    println(
        s.solution(
            arrayOf(
                intArrayOf(0, 0, 0, 0, 0),
                intArrayOf(0, 0, 0, 0, 0),
                intArrayOf(0, 0, 0, 0, 0),
                intArrayOf(0, 0, 1, 0, 0),
                intArrayOf(0, 0, 0, 0, 0)
            )
        ) == 16
    )
    println(
        s.solution(
            arrayOf(
                intArrayOf(0, 0, 0, 0, 0),
                intArrayOf(0, 0, 0, 0, 0),
                intArrayOf(0, 0, 0, 0, 0),
                intArrayOf(0, 0, 1, 1, 0),
                intArrayOf(0, 0, 0, 0, 0)
            )
        ) == 13
    )

    println(
        s.solution(
            arrayOf(
                intArrayOf(1, 1, 1, 1, 1),
                intArrayOf(1, 1, 1, 1, 1),
                intArrayOf(1, 1, 1, 1, 1),
                intArrayOf(1, 1, 1, 1, 1),
                intArrayOf(1, 1, 1, 1, 1)
            )
        ) == 0
    )
}