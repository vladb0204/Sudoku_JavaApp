package com.company

class FindNumbers {

    private var tableKotlin = Main.table;

    private fun findNums(cells: Array<CharArray>): Boolean {
        var findFlag: Boolean = true;
        for (i in 0..8) {

            for (j in 0..8) {

                for (k in 0..8) {
                    if (tableKotlin[i][j] == tableKotlin[i][k]) {
                        findFlag = false
                    }
                }
            }
        }

        return findFlag;
    }

    public fun transposeTable(cells: Array<CharArray>): Array<CharArray> {
        var transposeMatrix = arrayOf (
                charArrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
                charArrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
                charArrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
                charArrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
                charArrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
                charArrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
                charArrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
                charArrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '),
                charArrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ')
        )
        for (i in 0 until 9) {

            for (j in 0 until 9) {
                transposeMatrix[j][i] = tableKotlin[i][j]
            }
        }

        return transposeMatrix
    }

    protected fun checkTable(cells: Array<CharArray>) {
        var transposedCells: Array<CharArray> = transposeTable(tableKotlin);
        var check: Boolean = findNums(transposedCells);
        var check1: Boolean = findNums(tableKotlin);
    }
}