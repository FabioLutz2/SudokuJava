package com.github.FabioLutz2.ui;

import com.github.FabioLutz2.model.SudokuBoard;

public class ConsoleUi {
    public void render(SudokuBoard board) {
        System.out.println("-------------------------");
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i > 0) {
                System.out.println("-------------------------");
            }
            System.out.print("| ");
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j > 0) {
                    System.out.print("| ");
                }
                var value = board.displayValue(i, j);
                System.out.print((value == 0 ? "." : value) + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------------------");
    }
}
