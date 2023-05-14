package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        int temp1 = array[source];
        array[source] = array[dest];
        array[dest] = temp1;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp2 = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp2;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] rsl = swapBorder(nums);
        for (int i : rsl) {
            System.out.print(i);
        }
        System.out.println();
        int[] array = new int[]{1, 2, 3, 4};
        int[] rsl2 = SwitchArray.swap(array, 1, 3);
        for (int index : rsl2) {
            System.out.print(index);
        }
    }
}