package collections.viertesemester.konfigurator;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Konfigurator {
        public static List<String> liesKonfigurationsdatei() throws IOException {


        List<String> stringList = new ArrayList<>();

            String filename = "src/main/resources/konfiguratorFile";

            try(BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream(filename)))){


                String line = bfr.readLine();

                while(line != null){
                    stringList.add(line);
                    line = bfr.readLine();
                }
                } catch (IOException e){
                System.out.println("Fehler!!!!");
            }

            return stringList;
        }

        public static Map<String, String> convertToMap(List<String> stringList){

            Map<String, String> newMap = new HashMap<>();

            for(String str: stringList){
                int index = str.indexOf('=');
                String key = str.substring(0, index);
                String value = str.substring(index+1);
                newMap.put(key, value);
            }

            return newMap;
        }
}
