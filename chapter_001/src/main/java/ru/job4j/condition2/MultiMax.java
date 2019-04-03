package ru.job4j.condition2;

/**
 * @version 1.1
 * @autor Evgeny
 * @since 03.04.19
 */
public class MultiMax {
    /**
     * Метод вычисления наибольшего из трех.
     * Method max.
     *
     * @param first
     * @param second
     * @param third
     * @return result Max of First or Second or Third.
     */
    public int max(int first, int second, int third) {
        int result;
        result = first < second ? second : first;
        result = result < third ? third : result;
        return result;
    }

}