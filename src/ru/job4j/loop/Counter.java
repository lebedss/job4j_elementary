package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int value = start; value <= finish; value++) {
            sum = sum + value;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sumEven = 0;
        for (int value = start; value <= finish; value++) {
            if (value % 2 == 0) {
                sumEven = sumEven + value;
            }
        }
        return sumEven;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }
}