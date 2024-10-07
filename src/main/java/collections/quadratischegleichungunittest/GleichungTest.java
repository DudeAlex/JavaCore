package collections.quadratischegleichungunittest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class GleichungTest {
    final double DELTA = 0.00001;

    @Test
    public void testExceptionWhenAisZero(){
        try{
            Gleichung gleichung = new Gleichung(0,2,3);
            fail("Missing Exception");
        } catch (RuntimeException e){
            assertEquals("a darf nicht 0 sein", e.getMessage());
        }
    }

    @Test
    public void test2Roots(){
        Gleichung gleichung = new Gleichung(2, -8, 3);
        // expected x1
        // expected x2

        assertEquals(3.58113883, gleichung.roots()[0], DELTA);
        assertEquals(0.41886117, gleichung.roots()[1], DELTA);

    }

    @Test
    public void test1Root(){


    }


    }
