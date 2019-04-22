package ru.job4j.array;

/**
 * Class Turn переворачивает массив.
 *
 * @author Evgeny.
 * @version 1.1
 * @since 21.04.19
 */
public class Turn {
    /**
     * Method back.
     *
     * @param array исходный массив.
     * @return перевернутый массив.
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }
        return array;
    }
}