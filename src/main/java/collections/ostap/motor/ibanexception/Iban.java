package collections.ostap.motor.ibanexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Iban {

    String iban;

    public boolean checkIban() throws FalscheIBANException {
        if (iban.indexOf(0) == 'D' && iban.indexOf(1) == 'E' && iban.length() == 20) return true;

        throw new FalscheIBANException("falsche IBAN");
    }



    public List<String> liesIbanAusDatei(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            List<String> result = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
            }
            return result;
        } catch (IOException e) {
            throw new RuntimeException();
        }

    }

        class FalscheIBANException extends Exception {

            public FalscheIBANException() {
            }

            public FalscheIBANException(String str) {
                super(str);
            }

    }
}


