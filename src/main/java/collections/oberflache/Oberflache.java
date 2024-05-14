package collections.oberflache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Oberflache {
    public static int berechneQuaderOberflaeche(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) throw new RuntimeException("Ungültiges Argument");
        return 2 * a * b + 2 * a * c + 2 * b * c;
    }

    @Test
    public void testFehlerfall() {
        try {
            berechneQuaderOberflaeche(1, 1, -1);
            fail("Runtime Exception erwartet");
        } catch (RuntimeException e) {
            String errorMessage = e.getMessage();
            assertEquals("Ungültiges Argument", errorMessage);
        }
    }
}
