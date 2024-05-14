package collections.oberflache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Punkt {
    int x;
    int y;

    public void verschiebePunkt(int zielX, int zielY) {
        if(zielX < 0 || zielX > 1920 || zielY < 0 || zielY > 1080) throw new RuntimeException("Координаты не могут быть отрицательными");
        x = zielX;
        y = zielY;
    }

    @Test
    public void testVerschiebePunkt(){
        try{
            verschiebePunkt(-14, -241);
            fail("Runtime exception");
        } catch (RuntimeException e){
            String errorMessage = e.getMessage();
            assertEquals("Координаты не могут быть отрицательными", errorMessage);
        }
    }

    @Test
    public void testPositiveVerschiebePunkt(){
        verschiebePunkt(9,20);
        assertEquals(x,9);
        assertEquals(y,20);
    }
}


