package ru.job4j.loop;

/**
 * @author Evgeny.
 * @version 1.1
 * @since 13.04.19
 */
public class Paint {
    /**
     * Method piramid.
     *
     * @param height высота.
     * @return пирамида из ^.
     */
    public String piramid(int height) {
        StringBuilder screen = new StringBuilder();
        int width = 2 * height - 1;
        for (int r = 0; r != height; r++) {
            for (int c = 0; c != width; c++) {
                if (r >= height - c - 1 && r + height - 1 >= c) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

}

