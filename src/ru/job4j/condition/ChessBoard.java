package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (Math.abs(y2 - y1) == Math.abs(x2 - x1)) {
                rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static void main(String[] args) {
        int answer1 = ChessBoard.way(6, 7, 1, 2);
        System.out.println("количество ходов для слона " + answer1);
        int answer2 = ChessBoard.way(7, 0, 0, 7);
        System.out.println("количество ходов для слона " + answer2);
        int answer3 = ChessBoard.way(2, 6, 4, 1);
        System.out.println("количество ходов для слона " + answer3);
    }
}