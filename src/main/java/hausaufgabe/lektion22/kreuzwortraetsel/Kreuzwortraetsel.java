package hausaufgabe.lektion22.kreuzwortraetsel;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Kreuzwortraetsel {
    static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel",
            "Beige", "Barriere", "Bein", "Beil", "Christ", "Christian", "Carmen"};

    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o2.length(),o1.length());
            }
        });
        t.addAll(Arrays.asList(alleWoerter));
        for (String wort : t)
            System.out.println(wort);


        /*
        System.out.println();
        System.out.println();
        t.stream()
                .sorted()
                .sorted((a,b) -> Integer.compare(b.length(),a.length()))
                .forEach(System.out::println);  //worter -> System.out.println(worter)*/
    }
}
