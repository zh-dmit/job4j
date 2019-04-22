package ru.job4j.array;

/**
 * Class Check проверяет одинаковое значение элементов массива.
 *
 * @author Evgeny.
 * @version 1.1
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
        int indexF = 0, indexT = 0;
        boolean result = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == false) {
                indexF++;
            } else if (data[i] == true) {
                indexT++;
            }
        }
        if (indexF == data.length) {
            result = true;
        } else if (indexT == data.length) {
            result = true;
        }
        return result;
    }
}