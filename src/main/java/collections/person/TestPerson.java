package collections.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPerson {

    @Test
    public void testPerson(){
        Adresse adresse = new Adresse("Am Hubland", "16", "97074", "wurzburg");
        Person person = new Person("Daniyar", "Sabirov", adresse);
        assertNotNull(person);
    }

    @Test
    public void testVorname(){
        Adresse adresse = new Adresse("Am Hubland", "16", "97074", "Wurzburg");
        Person person = new Person("daniyar", "Sabirov", adresse);
    }
}
