package ru.job4j.loop;

/**
 * Класс Factorial.
 * Вычисление факториала числа.
 */

public class Factorial {
    /**
     * Method calc.
     *
     * @param n целое не отрицательное число.
     * @return result факториал n.
     */

    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}