package collections.viertesemester.konfigurator;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;

public class KonfiguratorTest {

    Map<String, String> mapTest = Konfigurator.convertToMap(Konfigurator.liesKonfigurationsdatei());

    public KonfiguratorTest() throws IOException {}


    @Test
    public void testFirstKonfigurator() throws IOException {

        String testKey = "mail.transport.protocol";
        String testValue = "smtp";


        assert checkTest(mapTest, testKey, testValue);

    }


    @Test
    public void testLastKonfigurator() throws IOException {

        String testKey = "password";
        String testValue = "k[O8a}5#";

        assert checkTest(mapTest, testKey, testValue);


    }



    private boolean checkTest(Map<String, String> mapTest, String testKey, String testValue){

        boolean match = false;

        for(Map.Entry<String, String> entry : mapTest.entrySet()){

            String enrtyKey = entry.getKey();
            String entryValue = entry.getValue();

            if(enrtyKey.equals(testKey) && entryValue.equals(testValue))  match = true;

        }

        return match;

    }




}
