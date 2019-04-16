package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for class Square.
 */

public class SquareTest {

    /**
     * Test for calculate.
     */

    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square sqr = new Square();
        int result[] = sqr.calculate(bound);
        int [] expect = new int[] {1, 4, 9};
        assertThat(result, is(expect));
    }
}