package hausaufgabe.lektion17.wertebereich;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class WertebereicheTest {

    @Test
    public void arrayNullTest(){
        Wertebereiche wertebereiche = new Wertebereiche();
        //byte[] data = null;

        try{
            wertebereiche.write(null, 0, 2);
            fail("NullPointerException expected");
        } catch (NullPointerException e){
        } catch (IOException e){
            fail(e);
        }
    }

    @Test
    public void offMinusEinsTest(){
        Wertebereiche wertebereiche = new Wertebereiche();
        byte[] data = {1,2,3,4,5,6,7};

        try{
            wertebereiche.write(data, -1,3);
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            fail(e);
        }
    }

    @Test
    public void summeGroßeAlsLengthTest(){
        Wertebereiche wertebereiche = new Wertebereiche();
        byte[] data = {1,2,3,4,5,6};
        try{
            wertebereiche.write(data, 2,8);
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            fail(e);
        }
    }

























/*
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
    }*/
}
