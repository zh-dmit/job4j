package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
            if ((array.length - 1) / 2 == i) {
                break;
            }
        }
        return array;
    }
}