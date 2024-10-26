package collections.interfaces.munzautomat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ChangeCalculatorTest {
    @Test
    public void testGetChange_1Euro50Cents() {
        ChangeCalculator calculator = new ChangeCalculatorUpdate();
        int[] result = calculator.getChange(1, 50);
        int[] expected = {0, 0, 0, 0, 0, 1, 1, 0}; // Ожидаемый результат ( 1 монета 1 евро, 1 монета 50 центов )
        assertArrayEquals(expected, result);
    }

    @Test
    public void testGetChange_99Cents() {
        ChangeCalculator calculator = new ChangeCalculatorUpdate();
        int[] result = calculator.getChange(0, 99);
        int[] expected = {0, 2, 1, 0, 2, 1, 0, 0}; // Ожидаемый результат ( 1 монета 50 центов, 2 монеты по 20, 1 монета 5)
        assertArrayEquals(expected, result);
    }

    @Test
    public void testGetChange_0Euro0Cents() {
        ChangeCalculator calculator = new ChangeCalculatorUpdate();
        int[] result = calculator.getChange(1, 23);
        int[] expected = {1, 1, 0, 0, 1, 0, 1, 0}; // Ожидаемый результат ( ни одной монеты)
        assertArrayEquals(expected, result);
    }
    @Test
    void testGetChangeFor200Cents() {
        ChangeCalculator calculator = new ChangeCalculatorUpdate();
        int[] result = calculator.getChange(2, 0); // 2 евро

        // Ожидаемое: 1 монета 2 евро
        int[] expected = {0, 0, 0, 0, 0, 0, 0, 1};
        assertArrayEquals(expected, result);
    }
}
