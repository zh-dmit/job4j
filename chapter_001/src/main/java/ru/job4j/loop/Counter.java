package ru.job4j.loop;

/**
 * Класс Counter суммирует все числа кратные двум в диапазоне от start до finish.
 *
 * @version 1.1
 * @autor Evgeny.
 * @since 04.04.19
 */
public class Counter {
    /**
     * Метод add
     *
     * @param start
     * @param finish
     * @return sum
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (; start <= finish; start++) {
            sum = (start % 2 == 0) ? (sum + start) : (sum + 0);
        }
        return sum;
    }

}