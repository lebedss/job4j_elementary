package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0 && number % 2 == 0) {
            rsl = "The number divides by 6.";
        } else if (number % 3 == 0) {
            rsl = "The number divides by 3, but it isn't the even number.";
        } else if (number % 2 == 0) {
            rsl = "The number doesn't divide by 3, but it is the even number.";
        } else {
            rsl = "The number doesn't divide by 3 and it isn't the even number.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl1 = DivideBySix.checkNumber(24);
        System.out.println(rsl1);
        String rsl2 = DivideBySix.checkNumber(9);
        System.out.println(rsl2);
        String rsl3 = DivideBySix.checkNumber(14);
        System.out.println(rsl3);
        String rsl4 = DivideBySix.checkNumber(25);
        System.out.println(rsl4);
    }
}
