package ru.job4j.array;

/**
 * Class Square возведение в корень элементов массива.
 *
 * @author Evgeny.
 * @version 1.1
 * @since 16.04.19
 */
public class Square {
    /**
     * Method calculate.
     *
     * @param bound количество объектов массива.
     * @return массив в квадарате.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 1; i <= bound; i++) {
            rst[i - 1] = i * i;
        }
        return rst;
    }
}