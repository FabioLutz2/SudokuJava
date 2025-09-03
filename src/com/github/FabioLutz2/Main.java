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
            System.out.println("""
                    Selecione uma das opções:
                    0 - Sair
                    1 - Ver tabuleiro
                    2 - Inserir um valor
                    3 - Remover um valor
                    4 - Finalizar jogo
                    """);

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

                    if (row < 0 || row > 8 || col < 0 || col > 8 || value < 1 || value > 9) {
                        System.out.println("Valor ou posição inválidos");
                        continue;
                    }

                    if (!sudokuBoard.setValue(row, col, value)) {
                        System.out.println("Não foi possível definir o valor na posição desejada");
                    }
                }
                case 3 -> {
                    System.out.println("Insira a linha:");
                    var row = scanner.nextInt() - 1;

                    System.out.println("Insira a coluna:");
                    var col = scanner.nextInt() - 1;

                    if (row < 0 || row > 8 || col < 0 || col > 8) {
                        System.out.println("Valor ou posição inválidos");
                        continue;
                    }

                    if (!sudokuBoard.setValue(row, col, 0)) {
                        System.out.println("Não foi possível remover o valor na posição desejada");
                    }
                }
                case 4 -> {
                    if (sudokuBoard.checkGame()) {
                        System.out.println("Todas as posições estão corretas");
                    } else {
                        System.out.println("Há posições inválidas");
                    }
                }
                default -> System.out.println("Opção inválida");
            }
        }

    }
}
