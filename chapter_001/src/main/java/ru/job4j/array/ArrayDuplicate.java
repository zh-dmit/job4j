package ru.job4j.array;

import java.util.Arrays;

/**
 * Class ArrayDuplicate удаляет дубликаты из массива.
 *
 * @author Evgeny.
 * @version 1.1
 * @since 06.05.19
 */
public class ArrayDuplicate {
    /**
     * Method remove.
     *
     * @param array массив с дубликатами.
     * @return array без дуюликатов.
     */
    public String[] remove(String[] array) {
        int length = array.length;
        for (int indexA = 0; indexA < length; indexA++) {
            for (int indexB = indexA + 1; indexB < length; indexB++) {
                if (array[indexA].equals(array[indexB])) {
                    array[indexB] = array[length - 1];
                    length--;
                    indexB--;
                }
            }
        }
        return Arrays.copyOf(array, length);
    }

}