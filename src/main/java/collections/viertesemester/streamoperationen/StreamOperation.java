package collections.viertesemester.streamoperationen;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {

    List<String> namen = Arrays.asList("Anna", "Boris", "Clara", "Anton", "Benjamin");

    Stream<String> stream = namen.stream();

    public void filtern(){
        List<String> result = namen.stream()
                .filter(stream -> stream.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("a) Namen mit 'A' in Großbuchstaben, sortiert:");
        result.forEach(System.out::println);
    }

    public void zahlen(){
        long count = namen.stream()
                .filter(stream -> stream.contains("n"))
                .count();

        System.out.println("b) Anzahl der Namen mit 'n': " + count);

    }

    public static void main(String[] args){

        StreamOperation so = new StreamOperation();
        so.filtern();
        so.zahlen();

    }




}
