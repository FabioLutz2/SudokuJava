package com.github.FabioLutz2;

import com.github.FabioLutz2.model.SudokuBoard;
import com.github.FabioLutz2.ui.ConsoleUi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SudokuBoard sudokuBoard = new SudokuBoard(args[0]);
        ConsoleUi consoleUi = new ConsoleUi();

        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println(
                    """
                            Selecione uma das opções:
                            0 - Sair
                            1 - Ver tabuleiro
                            2 - Inserir um valor
                            """
            );

            option = scanner.nextInt();

            switch (option) {
                case 0 -> System.exit(0);
                case 1 -> consoleUi.render(sudokuBoard);
                case 2 -> {
                    System.out.println("Insira a linha:");
                    var row = scanner.nextInt() - 1;

                    System.out.println("Insira a coluna:");
                    var col = scanner.nextInt() - 1;

                    System.out.println("Insira o valor:");
                    var value = scanner.nextInt();

                    if (row < 0 || row > 8 || col < 0 || col > 8 || value < 0 || value > 9) {
                        System.out.println("Valor ou posição inválidos");
                        continue;
                    }

                    if (!sudokuBoard.setValue(row, col, value)) {
                        System.out.println("Não foi possível definir o valor na posição desejada");
                    }
                }
                default -> System.out.println("Opção inválida");
            }
        }

    }
}
