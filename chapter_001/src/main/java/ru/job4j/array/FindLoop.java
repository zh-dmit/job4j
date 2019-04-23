package ru.job4j.array;

/**
 * Class FindLoop находит число в массиве и возвращает его элемент.
 *
 * @author Evgeny.
 * @version 1.3
 * @since 17.04.19
 */

public class FindLoop {
    /**
     * Method indexOf.
     *
     * @param data исходный массив.
     * @param el   элемент для поиска.
     * @return индекс элемента в массиве.
     */
    public int indexOf(int[] data, int el) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                result = index;
                break;
            }
        }
        return result;
    }
}