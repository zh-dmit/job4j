package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * Class ArrayDuplicateTest проверяет class ArrayDuplicate.
 *
 * @author Evgeny.
 * @varsion 1.1
 * @since 06.05.19
 */

public class ArrayDuplicateTest {
    /**
     * Test for method remove.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = {"Hello", "World", "Hello", "Hello", "DELL", "World"};
        String[] expected = {"Hello", "World", "DELL"};
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(expected));
    }
}