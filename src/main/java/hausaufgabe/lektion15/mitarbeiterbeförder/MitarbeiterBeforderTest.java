package hausaufgabe.lektion15.mitarbeiterbeförder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MitarbeiterBeforderTest {

    @Test
    public void testBerechneGehaltAngestellte() {
        Angestellte angestellte = new Angestellte("Potter", "Harry", 123, 1000.0, "31 July");
        assertEquals(1000.0, angestellte.berechneGehalt());
    }

    @Test
    public void testBerechneGehaltAbteilungsleiter() {
        Abteilungsleiter abteilungsleiter = new Abteilungsleiter("Dumbledore", "Albus", 111, 1500.0, "1 July");
        assertEquals(3000.0, abteilungsleiter.berechneGehalt());  // Grundgehalt * gehaltsfaktor (1500 * 2)
    }

    @Test
    public void testBefordern() {
        Angestellte angestellte = new Angestellte("Potter", "Harry", 123, 1000.0, "31 July");
        Abteilungsleiter abteilungsleiter = new Abteilungsleiter("Dumbledore", "Albus", 111, 1500.0, "1 July");

        abteilungsleiter.befordern(angestellte);
        assertEquals(1100.0, angestellte.berechneGehalt());  // После повышения, Gehaltsfaktor увеличен на 10%
    }
}
