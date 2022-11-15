package ru.otus.game;

public class Game {

    private final Dice dice;
    private final GameWinnerPrinter winnerPrinter;

    public Game(Dice dice, GameWinnerPrinter winnerPrinter) {
        this.dice = dice;
        this.winnerPrinter = winnerPrinter;
    }

    public void playGame(Player player1, Player player2) {
        int player1Result = dice.roll();
        int player2Result = dice.roll();
        Player winner = (player1Result > player2Result)? player1: player2;
        winnerPrinter.printWinner(winner);

        //// Второй тест (начало)
        // if (winner.equals(player1) && player1Result <= player2Result) {
        //    throw new AssertionError(String.format("Expected %d >= %d", player1Result, player2Result));
        // } else if (winner.equals(player2) && player2Result <= player1Result) {
        //    throw new AssertionError(String.format("Expected %d >= %d", player2Result, player1Result));
        // }
        //// Второй тест (конец)

        //// Третий тест (начало)
        //if (player1.equals(player2)) {
        //    throw new AssertionError(String.format("Expected %s != %s", player1.toString(), player2.toString()));
        // }
        //// Третий тест (конец)

        //// Четвёртый тест (начало)
        // if (!winner.equals(player1) && !winner.equals(player2)) {
        //    throw new AssertionError(String.format("Expected %s = one of %s, %s",
        //            winner.toString(), player1.toString(), player2.toString()));
        // }
        //// Четвёртый тест (конец)
    }

}