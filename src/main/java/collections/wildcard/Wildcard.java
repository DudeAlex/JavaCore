package collections.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Wildcard {
    public static void printList(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        strings.add("Hallo");
        strings.add("Welt");
        doubles.add(1.252);
        doubles.add(2.124242);
        printList(strings);
        printList(doubles);
    }
}
