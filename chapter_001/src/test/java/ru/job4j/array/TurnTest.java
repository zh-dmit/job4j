package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Turn class.
 *
 * @author Evgeny.
 * @version 1.1
 * @since 21.04.19
 */


public class TurnTest {
    /**
     * Test for method back.
     */

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] array = new int[]{1, 4, 6, 7};
        int[] expected = new int[]{7, 6, 4, 1};
        int[] result = turn.back(array);
        assertThat(result, is(expected));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] result = turn.back(array);
        assertThat(result, is(expected));
    }
}