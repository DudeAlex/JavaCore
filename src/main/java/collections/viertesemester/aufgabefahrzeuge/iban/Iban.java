package collections.viertesemester.aufgabefahrzeuge.iban;

import java.io.*;

public class Iban {


    public boolean ibanCheck(String iban) throws FalscheIBANException {
        char[] array = iban.toCharArray();

        if(array[0] != 'D' || array[1] != 'E'){
            throw new FalscheIBANException(iban + " ist Falsche IBAN");
        } else if (array.length != 22) {
            throw new FalscheIBANException(iban + " содержит неправильное кол-во символов, а именно: ");
        }

        return true;
    }

    public void ibanAusDateiLesen(String fileName) throws FalscheIBANException {


        try {
            BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

            String v = bfr.readLine();

            while (v != null) {
                ibanCheck(v);
                v = bfr.readLine();
            }

            bfr.close();
            System.out.println("Операция прошла успешно");
        }

        catch (FileNotFoundException e) {
                System.out.println("Datei " + fileName + " nicht gefunden");
        }
        catch (NullPointerException e) {
            System.out.println("Datei " + fileName + "nicht gefunden");
        }
        catch (IOException e) {
            System.out.println("Fehler beim Lesevorgang von Datei: " + fileName);
        }
    }


    public void dateienTest(String[] filenames) throws FalscheIBANException {



        for(int i = 0; i < filenames.length; i++){
            ibanAusDateiLesen(filenames[i]);
        }


    }
}

