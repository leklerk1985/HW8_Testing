package ru.otus;


import ru.otus.DiceImplTest;
import ru.otus.game.DiceImpl;

public class HomeWork {

    /*
        Заготовка для ДЗ представляет собой игру в кости.
        При вызове game.playGame(), два игрока кидают кости.
        Выигрывает игрок, у кого результат (1-6) больше
        Написать тесты (минимум 4) на классы DiceImpl и Game.
        Тесты должны найти не менее двух ошибок.
        Информацию о пройденном тесте предлагается выводить в System.out, а об упавшем в System.err
     */
    public static void main(String[] args) {
        // Первый тест (значение метода roll() попадает в диапазон игральной кости (1-6)).
        new DiceImplTest().testReturnValueOfMethodRollBetween1And6();

        // Второй тест (результат у победителя больше, чем у проигравшего).
        new GameTest().testResultOfWinnerBigger();

        // Третий тест (игроки не равны друг другу).
        new GameTest().testPlayersAreNotEqual();

        // Четвёртый тест (победитель - один из игроков).
        new GameTest().testWinnerIsOneOfPlayers();
    }

}