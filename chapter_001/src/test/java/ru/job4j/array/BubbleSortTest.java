package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class Test for Class BubbleSort.
 *
 * @author Evgeny.
 * @version 1.1
 * @since 24.04.19
 */

public class BubbleSortTest {
    /**
     * Test for method sort.
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort sort = new BubbleSort();
        int[] array = new int[]{5, 1, 2, 7, 3};
        int[] expected = new int[]{1, 2, 3, 5, 7};
        int[] result = sort.sort(array);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSortArrayWithSixElementsThenSortedArray() {
        BubbleSort sort = new BubbleSort();
        int[] array = new int[]{16, 8, 24, 1, 5, -1};
        int[] expected = new int[]{-1, 1, 5, 8, 16, 24};
        int[] result = sort.sort(array);
        assertThat(result, is(expected));
    }
}