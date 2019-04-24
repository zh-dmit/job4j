package ru.job4j.array;

/**
 * Class BubbleSort.
 *
 * @author Evgeny.
 * @version 1.1
 * @since 24.04.19
 */
public class BubbleSort {
    int temp = 0;

    /**
     * Method sort.
     *
     * @param array массив для сортировки.
     * @return отсортированный массив.
     */
    public int[] sort(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int a = 0; a < i; a++) {
                if (array[a] > array[a + 1]) {
                    temp = array[a + 1];
                    array[a + 1] = array[a];
                    array[a] = temp;
                }
            }
        }
        return array;
    }
}