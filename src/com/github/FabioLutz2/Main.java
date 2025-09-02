package com.github.FabioLutz2;

import com.github.FabioLutz2.model.SudokuBoard;
import com.github.FabioLutz2.ui.ConsoleUi;

public class Main {
    public static void main(String[] args) {
        SudokuBoard sudokuBoard = new SudokuBoard(args[0]);

        ConsoleUi consoleUi = new ConsoleUi();

        consoleUi.render(sudokuBoard);
    }
}
