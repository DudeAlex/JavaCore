package collections.viertesemester.iban;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Iban {

    public void checkIban(String iban){

        char[] array = iban.toCharArray();

        if(array[0] != 'D' || array[1] != 'E')
            throw new FalscheIBANException("Falsche Iban");

        else{
            if(array.length != 21) throw new FalscheIBANException();
        }
    }


    public List<String> liesIbanAusDatei(String dateiname) throws IOException {
        List<String> ungultigeIbans = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(dateiname))) {
            String zeile;

            while ((zeile = br.readLine()) != null) {
                String iban = zeile.trim();

                try {
                    checkIban(iban);
                } catch (FalscheIBANException e) {
                    ungultigeIbans.add(iban);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ungultigeIbans;
    }

    public Map<String, List<String>> liesIbanAusDatein(List<String> dateinamen) throws IOException {

        Map<String, List<String>> ergebnisse = new HashMap<>();

        for(String dateiname : dateinamen){
            List<String> ungultigeIbans = liesIbanAusDatei(dateiname);
            if(!ungultigeIbans.isEmpty()){
                ergebnisse.put(dateiname, ungultigeIbans);
            }
        }

        return ergebnisse;

    }
}
