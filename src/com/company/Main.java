package com.company;

import java.util.*;
import java.lang.*;

public class Main {

    public static char[][] table = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'},
    };

    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        sudoku.transformTable(table);
        sudoku.printTable(table);
        System.out.println();
        System.out.println();
        sudoku.generateTable(table);
        sudoku.printTable(table);
    }
}