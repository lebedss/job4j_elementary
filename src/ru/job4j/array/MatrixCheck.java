package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int j = 0; j < board[row].length; j++) {
            if (board[row][j] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(char[][] board, int column) {
        for (char[] chars : board) {
            if (chars[column] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] diagonal = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            diagonal[i] = board[i][i];
        }
        return diagonal;
    }

    public static boolean isWin(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X' && monoHorizontal(board, i) || monoVertical(board, i)) {
                return true;
            }
        }
        return false;
    }
}
