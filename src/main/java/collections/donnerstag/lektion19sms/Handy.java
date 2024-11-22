package collections.donnerstag.lektion19sms;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Handy {

    public static void convert() {

        int i;

        try (FileInputStream br = new FileInputStream(("src/main/java/collections/donnerstag/lektion19sms/zeichnen.txt"));
             FileOutputStream bw = new FileOutputStream(("src/main/java/collections/donnerstag/lektion19sms/nummer.txt")))
        {

            Map<String, Integer> map = new HashMap<>();
            map.put("ABC", 2);
            map.put("DEF", 3);
            map.put("GHI", 4);
            map.put("JKL", 5);
            map.put("MNO", 6);
            map.put("PQRS", 7);
            map.put("TUV", 8);
            map.put("WXYZ", 9);


            do{
                i = br.read();
                for(String s : map.keySet()){
                    if(s.indexOf(i) != -1) bw.write(map.get(s).toString().getBytes());
                }
            } while (i != -1);

            /*do{
                i = br.read();
                if(i != -1) bw.write(((i - 65) / 3) + 50);
            } while(i != -1);*/


        } catch (IOException e) {
            System.out.println("keine File");
        }
    }



}
