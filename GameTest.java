package ru.otus;
import ru.otus.game.*;

public class GameTest {
	
	/////////// *** Второй тест (результат у победителя больше, чем у проигравшего).
	
    public void testResultOfWinnerBigger() {
        String scenario = "Тест: результат у победителя больше, чем у проигравшего";
        try {
            Dice dice = new DiceImpl();
            GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
            playGame_test2(new Player("Вася"), new Player("Игорь"), dice, winnerPrinter);
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
	
	// Процедура playGame() из Game.java, изменённая для второго теста.
	public void playGame_test2(Player player1, Player player2, Dice dice, GameWinnerPrinter winnerPrinter) {
        int player1Result = roll_test2();
        int player2Result = roll_test2();
        Player winner = (player1Result > player2Result)? player1: player2;
        winnerPrinter.printWinner(winner);
      
        if (winner.equals(player1) && player1Result <= player2Result) {
			throw new AssertionError(String.format("Expected %d >= %d", player1Result, player2Result));
        } else if (winner.equals(player2) && player2Result <= player1Result) {
			throw new AssertionError(String.format("Expected %d >= %d", player2Result, player1Result));
        }
    }

    // Процедура roll() из DiceImpl.java, изменённая для второго теста.
    public int roll_test2() {
        return 4;
    }

	
	/////////// *** Третий тест (игроки не равны друг другу).

    public void testPlayersAreNotEqual() {
        String scenario = "Тест: игроки не равны друг другу";
        try {
            Dice dice = new DiceImpl();
            GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
            playGame_test3(new Player("Вася"), new Player("Игорь"), dice, winnerPrinter);
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
	
	// Процедура playGame() из Game.java, изменённая для третьего теста.
	public void playGame_test3(Player player1, Player player2, Dice dice, GameWinnerPrinter winnerPrinter) {
        int player1Result = dice.roll();
        int player2Result = dice.roll();
        Player winner = (player1Result > player2Result)? player1: player2;
        winnerPrinter.printWinner(winner);

        if (player1.equals(player2)) {
			throw new AssertionError(String.format("Expected %s != %s", player1.toString(), player2.toString()));
        }
    }
	
	
	/////////// *** Четвёртый тест (победитель - один из игроков).

    public void testWinnerIsOneOfPlayers() {
        String scenario = "Тест: победитель - один из игроков";
        try {
            Dice dice = new DiceImpl();
            GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
            playGame_test4(new Player("Вася"), new Player("Игорь"), dice, winnerPrinter);
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
	
	// Процедура playGame() из Game.java, изменённая для четвёртого теста.
	public void playGame_test4(Player player1, Player player2, Dice dice, GameWinnerPrinter winnerPrinter) {
        int player1Result = dice.roll();
        int player2Result = dice.roll();
        Player winner = (player1Result > player2Result)? player1: player2;
        winnerPrinter.printWinner(winner);

        if (!winner.equals(player1) && !winner.equals(player2)) {
			throw new AssertionError(String.format("Expected %s = one of %s, %s", winner.toString(),
                    player1.toString(), player2.toString()));
        }
    }	
	
}
