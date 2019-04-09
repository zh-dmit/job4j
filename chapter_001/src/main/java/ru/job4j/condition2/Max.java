package ru.job4j.condition2;

/**
 * max if first > second
 *
 * @version 1.1
 * @autor Evgeny
 * @since 03.04.19
 */

public class Max {
    /**
     * Method max.
     *
     * @param first first
     * @param second second
     * @return first > second ? first : second.
     */

    public int max(int first, int second) {
        return first > second ? first : second;
    }
}