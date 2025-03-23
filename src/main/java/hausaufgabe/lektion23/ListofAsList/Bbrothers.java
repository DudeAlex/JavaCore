package hausaufgabe.lektion23.ListofAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bbrothers {
    public static void main(String[] args) {

        List<String> bBrothers = Arrays.asList("Burt", "Bronski", "Peter");

        List<String> bBrothers1 = List.of("Burt", "Bronski", "Peter");


        bBrothers.add("Karl");

        bBrothers1.add("Karl1");
    }





}
