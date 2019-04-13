package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.StringJoiner;

/**
 * @author Evgeny.
 * @version 1.1
 * @since 13.04.19
 */
public class PaintTest {
    /**
     * Test for method piramid.
     */
    @Test
    public void whenPyramid4() {
        Paint paint = new Paint();
        String result = paint.piramid(4);
        assertThat(result,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^   ")
                                .add("  ^^^  ")
                                .add(" ^^^^^ ")
                                .add("^^^^^^^")
                                .toString()
                ));


    }

    @Test
    public void whenPyramid3() {
        Paint paint = new Paint();
        String result = paint.piramid(3);
        assertThat(result,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("  ^  ")
                                .add(" ^^^ ")
                                .add("^^^^^")
                                .toString()
                ));
    }

}