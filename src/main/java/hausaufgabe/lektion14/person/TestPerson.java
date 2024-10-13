package hausaufgabe.lektion14.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPerson {

    @Test
    public void strasseTest(){
        try{
            Adresse adresse = new Adresse("qwer", "161", 97074, "Würzburg");
            fail("Strasse mit Großbuchstabe anfangen");
        } catch (Exception e){
            String errorMessage = e.getMessage();
            assertEquals(errorMessage, "Strasse muss mit Großbuchstabe starten");
        }
    }

    @Test
    public void hausnummerTest() {
        try {
            Adresse adresse = new Adresse("Qwer", "z161", 97074, "Würzburg");
            fail("Hausnummer mit Ziffer anfangen");
        } catch (Exception e) {
            String errorMessage = e.getMessage();
            assertEquals(errorMessage, "Hausnummer muss mit Ziffer starten");
        }
    }

    @Test
    public void ortTest(){
        try{
            Adresse adresse = new Adresse("Qwer","161", 97074, "würzburg");
            fail("Ort mit Großbuchstabe anfangen");
        } catch (Exception e){
            String errorMessage = e.getMessage();
            assertEquals(errorMessage, "Ort muss mit Großbuchstabe starten");
        }
    }

    @Test
    public void vornametest(){
        try{
            Adresse adresse = new Adresse("Qwer", "161", 97074, "Würzburg");
            Person person = new Person("harry", "Potter", adresse);
            fail("Vorname mit Großbuchstabe anfangen");
        } catch (Exception e){
            String errorMessage = e.getMessage();
            assertEquals(errorMessage, "Vorname muss mit Großbuchstabe starten");
        }
    }

    @Test
    public void normaleTest(){
            Adresse adresse = new Adresse("Qwer", "161", 97074, "Würzburg");
            Person person = new Person("Harry", "Potter", adresse);
            assertNotNull(person);


    }
}
