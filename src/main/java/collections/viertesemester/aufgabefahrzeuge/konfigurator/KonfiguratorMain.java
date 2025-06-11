package collections.viertesemester.aufgabefahrzeuge.konfigurator;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KonfiguratorMain {
    public static void main(String[] args) throws IOException {

        List<String> newList = Konfigurator.liesKonfigurationsdatei();

        for(String str: newList) {
            System.out.println(str);
        }

        System.out.println();
        System.out.println();
        System.out.println();


        Map<String, String> newnewMap = Konfigurator.convertToMap(newList);

        System.out.println("Konfigurationsdaten:");
        for (Map.Entry<String, String> entry : newnewMap.entrySet()) {
            System.out.println("  → " + entry.getKey() + " # " + entry.getValue());
        }


    }
}
