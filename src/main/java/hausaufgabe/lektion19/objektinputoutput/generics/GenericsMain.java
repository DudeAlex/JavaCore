package hausaufgabe.lektion19.objektinputoutput.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsMain {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Vasya");
        list.add("Petya");
        list.add("123");
        list.add("456");

        String str = list.get(3);

        System.out.println(str);
    }
}
