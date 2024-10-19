package collections.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundedWildcard {
    public static void main(String[] args) {
        //List<?> question = new ArrayList<>();
        //question.add("Hallo");
        /*List<String> strings = new ArrayList<>();
        strings.add("Hallo");
        List<String> list = strings;
        list.add("sdgfs");*/

        List<Integer> ints = Arrays.asList(new Integer[] {1,2,3});
        List<? extends Number> nbelow = ints;

        //Number n = new Integer(5);
        //nbelow.add(new Integer(5));
        //nbelow.add(5);
    }
}
