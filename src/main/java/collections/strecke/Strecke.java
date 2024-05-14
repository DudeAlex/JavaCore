package collections.strecke;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Strecke {
    int a;
    int b;

    public Strecke(int a, int b) {
        if (a < b) {
            this.a = a;
            this.b = b;
        } else {
            this.a = b;
            this.b = a;
        }
    }
}

    class TestStrecke {
        @Test
        public void testStrecke() {
            Strecke strecke = new Strecke(3, 5);
            assertEquals(3, strecke.a);
        }
    }

