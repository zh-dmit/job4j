package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Evgeny.
 * @version 1.1
 * @since 22.04.19
 */
public class CheckTest {
    /**
     * Test for method mono.
     */
    @Test
    public void wenArrayFalseThenTrue() {
        boolean[] data = {false, false, false};
        Check check = new Check();
        boolean result = check.mono(data);
        assertThat(result, is(true));
    }

    @Test
    public void whenArrayTrueThenTrue() {
        boolean[] data = {true, true, true, true};
        Check check = new Check();
        boolean result = check.mono(data);
        assertThat(result, is(true));
    }

    @Test
    public void whenArrayTrueAndFalseThenFalse() {
        boolean[] data = {true, false, true, false, false};
        Check check = new Check();
        boolean result = check.mono(data);
        assertThat(result, is(false));
    }

}