package com.github.FabioLutz2.ui;

public class ConsoleUi {

    int[][] space = new int[9][9];
    public void render() {
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
                System.out.print(space[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------------------");
    }
}
