package hausaufgabe.lektion14.punkt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class PunktTest {

    @Test
    public void negativeXYTest(){
        Punkt punkt = new Punkt();
        try{
            punkt.verschiebePunkt(-1,-2);
            fail("Keine negative Zahlen");
        } catch (Exception e){
            String errorMessage = e.getMessage();
            assertEquals(errorMessage, "keine negative Zahlen");
        }
    }

    @Test
    public void grosserAls1920(){
        Punkt punkt = new Punkt();
        try{
            punkt.verschiebePunkt(1944, 1111);
            fail("X kann nicht größer als 1920 sein");
        } catch (Exception e){
            String errorMessage = e.getMessage();
            assertEquals(errorMessage, "X kann nicht größer als 1920 sein");
        }
    }
    @Test
    public void grosserAls1080(){
        Punkt punkt = new Punkt();
        try{
            punkt.verschiebePunkt(1341, 1100);
            fail("Y kann nicht größer als 1080 sein");
        } catch (Exception e){
            String errorMessage = e.getMessage();
            assertEquals(errorMessage, "Y kann nicht größer als 1080 sein");
        }
    }

    @Test
    public void normaleZahlenTest(){
        Punkt punkt = new Punkt();
        punkt.verschiebePunkt(250,750);
        assertEquals(250, punkt.x);
        assertEquals(750, punkt.y);
    }
}
