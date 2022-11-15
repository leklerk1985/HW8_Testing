package ru.otus;
import ru.otus.game.DiceImpl;

public class DiceImplTest {
    public void testReturnValueOfMethodRollBetween1And6() {
        String scenario = "Тест: попадает ли значение метода roll() в диапазон игральной кости (1-6)?";
        try {
            DiceImpl dice = new DiceImpl();
            int valueRoll = dice.roll();
            valueBetween1And6(valueRoll);
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public static void valueBetween1And6(int value) {
        if (value < 1 || value > 6) {
            throw new AssertionError(String.format("Expected %d <= %d <= %d", 1, value, 6));
        }
    }
}
