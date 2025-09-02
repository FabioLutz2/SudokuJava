package com.github.FabioLutz2.model;

public class SudokuBoard {
    private final Space[][] spaces = new Space[9][9];

    public SudokuBoard(String positions) {
        parseConfig(positions);
    }

    private void parseConfig(String config) {
        String[] rawSpaces = config.split(";");

        for (int i = 0; i < 81; i++) {
            String[] parts = rawSpaces[i].split(",");

            int row = i / 9;
            int col = i % 9;
            spaces[row][col] = new Space(
                    Integer.parseInt(parts[0]),
                    Integer.parseInt(parts[1]) != 0
            );
        }
    }

    public int displayValue(int row, int col) {
        return spaces[row][col].getActual();
    }
}
