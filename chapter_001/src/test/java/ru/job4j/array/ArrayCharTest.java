package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for class ArrayChar.
 *
 * @author Evgeny.
 * @version 1.1
 * @since 23.04.19
 */
public class ArrayCharTest {
    /**
     * Test for method startWith.
     */
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar("Hello World");
        boolean result = word.startWith("Hello World");
        assertThat(result, is(true));
    }

    @Test
    public void whenStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar("World !");
        boolean result = word.startWith("Hellboy !");
        assertThat(result, is(false));
    }
}