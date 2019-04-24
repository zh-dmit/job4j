package ru.job4j.array;

/**
 * @author Evgeny.
 * @version 1.1
 * @since 23.04.19
 */

public class ArrayChar {
    private char[] data;

    /**
     * Объект класса ArrayChar.
     *
     * @param line строка для сравнения.
     */
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Method startWith.
     *
     * @param prefix строка с которой сравниваем.
     * @return истина или ложь.
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < data.length; i++) {
            if (data[i] != value[i]) {
                result = false;
                break;
            }
        }

        return result;
    }

}