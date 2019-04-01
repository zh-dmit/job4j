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
        int result = max.firstMax(4, 2);
        assertThat(result, is(1));
    }

    @Test
    public void secondMax() {
        Max max = new Max();
        int result = max.secondMax(1, 6);
        assertThat(result, is(1));
    }

    @Test
    public void equalsFS() {
        Max max = new Max();
        int result = max.equalsFS(1, 6);
        assertThat(result, is(0));
    }
}