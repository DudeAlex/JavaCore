package mitarbeiter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMitarbeiter {

    @Test
    public void testIfManagersFirstNameIsEmpty(){
        Manager manager = new Manager("", "", 12, "12 January");
        assertEquals("", manager.getFirstName());
    }

}
