package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class FindLoopTest
 *
 * @author Evgeny.
 * @version 1.1
 * @since 17.04.19
 */

public class FindLoopTest {
    /**
     * Test for method indexOf.
     */

    @Test
    public void wenArrayHas5Then0() {
        FindLoop fin = new FindLoop();
        int[] input = {5, 4, 6};
        int result = fin.indexOf(input, 5);
        int expected = 0;
        assertThat(result, is(expected));
    }

    @Test
    public void wenArrayHas8Then4() {
        FindLoop fin = new FindLoop();
        int[] input = {5, 3, 6, 14, 8, 6, 8};
        int result = fin.indexOf(input, 8);
        int expected = 4;
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayHas3ThenNAN() {
        FindLoop fin = new FindLoop();
        int[] input = {6, 4, 7};
        int result = fin.indexOf(input, 3);
        int expected = 0;
        assertThat(result, is(expected));
    }
}