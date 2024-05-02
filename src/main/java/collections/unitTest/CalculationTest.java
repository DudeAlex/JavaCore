package collections.unitTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculationTest {

    @Test
    public void addTest(){
        assertTrue(5 == Calculation.add(2,3));
        assertEquals(5, Calculation.add(2,3));
    }

    @Test
    public void firstBiggerSecondTest(){
        assertTrue(Calculation.firstBiggerSecond(3,1));
    }
}
