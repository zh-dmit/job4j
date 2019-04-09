package ru.job4j.loop;

/**
 * Class Board.
 * Рисует доску заданного размера с "Х" и " ".
 *
 * @autor Evgeny.
 * @varsion 1.1
 * @since 09.04.19
 */
public class Board {
    /**
     * Method paint.
     *
     * @param width  ширина доски.
     * @param height высота доски.
     * @return все что было записанно в объект screen класса StringBuilder.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int a = 0; a < width; a++) {
                if ((i + a) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }

}