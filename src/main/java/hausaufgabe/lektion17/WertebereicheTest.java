package hausaufgabe.lektion17;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class WertebereicheTest {

    @Test
    public void badOffsetGutLengthWriteToFileTest(){
        String data = "Пример записи";
        int offset = -9;
        int length = 10;

        try {
            Wertebereiche.writeToFile(data, offset, length);
            assertTrue(true);
        } catch (IndexOutOfBoundsException e) {
            fail("Наше сообщение: IndexOutOfBoundsException" + e.getMessage());
        }
    }

    @Test
    public void gutOffsetBadLengthWriteToFileTest() {
        String data = "Пример записи";
        int offset = 9;
        int length = -10;

        try {
            Wertebereiche.writeToFile(data, offset, length);
            assertTrue(true);
        } catch (IndexOutOfBoundsException e) {
            fail("Наше сообщение: IndexOutOfBoundsException " + e.getMessage());
        }
    }
    @Test
    public void positiveGutOffsetGutLengthWriteToFileTest() {
        String data = "Пример записи";
        int offset = 9;
        int length = 10;

        try {
            Wertebereiche.writeToFile(data, offset, length);
            assertTrue(true);
        } catch (IndexOutOfBoundsException e) {
            fail("Наше сообщение: IndexOutOfBoundsException " + e.getMessage());
        }
    }




}
