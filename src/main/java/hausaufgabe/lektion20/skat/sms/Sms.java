package hausaufgabe.lektion20.skat.sms;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Sms {

    int zeichnen;


    public void convertion() {
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("src/main/resources/Zeichenkontakte.txt"));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("src/main/resources/Nummernkontakte.txt"))){

           do{
               zeichnen = bufferedInputStream.read();
               try{
                   if(zeichnen != -1) bufferedOutputStream.write(TelephoneMap.convert(zeichnen));
               } catch (IllegalTelephoneNumberException ignored){
               }
           } while (zeichnen != -1);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


class IllegalTelephoneNumberException extends Exception {

}

class TelephoneMap {
    static final Map<String, Integer> telephone = new HashMap<>();
     static{
        telephone.put("ABC", 2);
        telephone.put("DEF", 3);
        telephone.put("GHI", 4);
        telephone.put("JKL", 5);
        telephone.put("MNO", 6);
        telephone.put("PQRS", 7);
        telephone.put("TUV", 8);
        telephone.put("WXYZ", 9);
    }
    public static int convert(int i) throws IllegalTelephoneNumberException {
        char ch = (char) i;
        for(Map.Entry<String, Integer> entry : telephone.entrySet()) {
            if(entry.getKey().contains(Character.toString(ch)))  return entry.getValue() + 48;
        }
        throw new IllegalTelephoneNumberException();
    }
}
