package com.company;

public class Sudoku {

    private boolean findFlag = true;

    public void transformTable(char[][] table) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (table[i][j] == 'i') {
                    table[i][j] = ' ';
                }
            }
        }
    }

    public void printTable(char[][] table) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void generateTable(char[][] Sudoku) {

    }

    private void findNums(char[][] cells) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 8; k++) {
                    if (cells[i][j] == cells[i][j]) {
                        findFlag = false;
                    }
                }
            }
        }
    }

    protected void checkTable(char[][] cells) {

    }
}
