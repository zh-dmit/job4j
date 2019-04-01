package ru.job4j.condition2;

/**
 * @author Evgeny
 * @version $1.1$
 * @since 01.04.19
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     *
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {

            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}