package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            /* минимальный элемент в массиве*/
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            /* индекс минимального элемента*/
            int tmp = data[index];
            data[index] = data[i];
            data[i] = tmp;
        }
        return data;
    }
}