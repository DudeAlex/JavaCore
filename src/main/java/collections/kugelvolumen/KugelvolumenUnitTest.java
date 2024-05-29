package collections.kugelvolumen;

import collections.unitTest.CalculationTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class KugelvolumenUnitTest {
    @Test
    public void testVergleichen(){
        assertEquals(113.09733552923254, Kugelvolumen.berechneKugelvolumen(3.0));
    }

    @Test
    public void testVergleichenWith0(){
        assertEquals(0.0, Kugelvolumen.berechneKugelvolumen(0.0));
    }

    @Test
    public void testVergleichenWith1(){
        assertEquals(4.1887902047863905, Kugelvolumen.berechneKugelvolumen(1.0));
    }

    @Test
    public void testVergleichenWith5(){
        assertEquals(4.1887902047863905, Kugelvolumen.berechneKugelvolumen(1.0));
    }

    @Test
    public void testVergleichenWithMinus1(){
        try {
            Kugelvolumen.berechneKugelvolumen(-1.0);
            int number = 5;
            System.out.println("I'm here");
            number = number/0;
            System.out.println("Hello world!");
            fail("В методе есть ошибка");
        }
        catch (Exception e){
            String errorMessage = e.getMessage();
            assertEquals("radius must be positiv", errorMessage);
        }
    }
    @Test
    public void testMinusWert(){
        assertEquals(113.09733552923254, Kugelvolumen.berechneKugelvolumen(3.0));
    }
}
