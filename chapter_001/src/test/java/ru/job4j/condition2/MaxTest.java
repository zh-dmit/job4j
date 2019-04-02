package ru.job4j.condition2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenFirstMax() {
        Max max = new Max();
        int result = max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void secondMax() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void equalsFS() {
        Max max = new Max();
        int result = max.max(1, 1);
        assertThat(result, is(1));
    }
}