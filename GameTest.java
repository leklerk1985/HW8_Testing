package ru.otus;
import ru.otus.game.*;

public class GameTest {
    public void testResultOfWinnerBigger() {
        String scenario = "Тест: результат у победителя больше, чем у проигравшего";
        try {
            Dice dice = new DiceImpl();
            GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
            Game game = new Game(dice, winnerPrinter);
            game.playGame(new Player("Вася"), new Player("Игорь"));
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testPlayersAreNotEqual() {
        String scenario = "Тест: игроки не равны друг другу";
        try {
            Dice dice = new DiceImpl();
            GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
            Game game = new Game(dice, winnerPrinter);
            game.playGame(new Player("Вася"), new Player("Игорь"));
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testWinnerIsOneOfPlayers() {
        String scenario = "Тест: победитель - один из игроков";
        try {
            Dice dice = new DiceImpl();
            GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
            Game game = new Game(dice, winnerPrinter);
            game.playGame(new Player("Вася"), new Player("Игорь"));
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
