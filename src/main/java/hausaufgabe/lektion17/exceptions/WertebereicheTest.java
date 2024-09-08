package hausaufgabe.lektion17.exceptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class WertebereicheTest {

    String data;
    @BeforeEach
    public void setUp() {
        data = "Пример записи";
    }

    private void writeToFile(String data, int offset, int length){
        try {
            Wertebereiche.writeToFile(data, offset, length);
            assertTrue(true);
        } catch (IndexOutOfBoundsException e) {
            fail("Наше сообщение: IndexOutOfBoundsException " + e.getMessage());
        } catch (IllegalArgumentException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void badOffsetGutLengthWriteToFileTest(){
        int offset = -9;
        int length = 10;

        writeToFile(data, offset, length);
    }

    @Test
    public void gutOffsetBadLengthWriteToFileTest() {
        int offset = 9;
        int length = -10;

        writeToFile(data, offset, length);
    }
    @Test
    public void positiveGutOffsetGutLengthWriteToFileTest() {
        int offset = 9;
        int length = 10;

        writeToFile(data, offset, length);
    }
}
