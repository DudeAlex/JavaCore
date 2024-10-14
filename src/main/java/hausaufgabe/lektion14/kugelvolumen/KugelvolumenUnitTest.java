package hausaufgabe.lektion14.kugelvolumen;

import hausaufgabe.lektion14.kugelvolumen.Kugelvolumen;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class KugelvolumenUnitTest {
    final double DELTA = 0.00001;

    @Test
    public void testVergleichen(){
        Kugelvolumen kugelvolumen = new Kugelvolumen();
        assertEquals(113.09733552923254, kugelvolumen.berechneKugelvolumen(3.0), DELTA);
    }


    @Test
    public void testVergleichenWith0(){
        Kugelvolumen kugelvolumen = new Kugelvolumen();
        assertEquals(0.0, kugelvolumen.berechneKugelvolumen(0.0), DELTA);
    }

    @Test
    public void testVergleichenWith1(){
        Kugelvolumen kugelvolumen = new Kugelvolumen();
        assertEquals(4.1887902047863905, kugelvolumen.berechneKugelvolumen(1.0), DELTA);
    }

    @Test
    public void testVergleichenWith5(){
        Kugelvolumen kugelvolumen = new Kugelvolumen();
        assertEquals(523.5987755982989, kugelvolumen.berechneKugelvolumen(5.0), DELTA);
    }

    @Test
    public void testVergleichenWithMinus1(){

        try {
            Kugelvolumen kugelvolumen = new Kugelvolumen();
            kugelvolumen.berechneKugelvolumen(-1.0);
            fail("radius must be positiv");
        } catch (Exception e) {
            //String errorMessage = e.getMessage(); // Получаем сообщение об ошибке из исключения
            assertEquals("radius must be positiv", e.getMessage()); // Проверяем, что сообщение соответствует ожидаемому
        }
    }
}
