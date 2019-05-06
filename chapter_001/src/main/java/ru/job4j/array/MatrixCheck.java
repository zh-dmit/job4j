package ru.job4j.array;

/**
 * class MatrixCheck.
 * Проверяет совпадают ли значения по диоганалям матрицы.
 *
 * @author Evgeny.
 * @versiov 1.1
 * @since 29.04.19
 */
public class MatrixCheck {
    /**
     * @param data двумерный массив (матрица).
     * @return true , false (если совпадают и если не совпадают).
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int indexA = 0; indexA < data.length - 1; indexA++) {
            if ((data[indexA][indexA] != data[indexA + 1][indexA + 1]) || (data[indexA][(data.length - 1) - indexA] != data[indexA + 1][(data.length - 2) - indexA])) {
                result = false;
                break;
            }
        }
        return result;
    }
}