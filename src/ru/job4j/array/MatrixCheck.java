package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[row].length; j++) {
                if (board[row][i] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
