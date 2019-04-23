package ru.job4j.array;

/**
 * Class Check проверяет одинаковое значение элементов массива.
 *
 * @author Evgeny.
 * @version 1.2
 * @since 22.04.19
 */
public class Check {
    /**
     * Method mono.
     *
     * @param data массив логических значений.
     * @return истина или лож.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[1] != data[i]) {
                result = false;
                break;
            }
        }

        return result;
    }
}