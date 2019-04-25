package ru.job4j.array;

/**
 * Class Matrix.
 *
 * @author Evgeny.
 * @version 1.1
 * @since 25.04.19
 */
public class Matrix {
    /**
     * Method multiple.
     *
     * @param size размер матрицы.
     * @return матрица.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int index = 0; index < size; index++) {
                table[i][index] = (i + 1) * (index + 1);
            }
        }
        return table;
    }
}