package collections.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Calculate {
    public static double multiplyAll(List<? extends Number> numbers) {
        if (numbers.isEmpty()) throw new RuntimeException("empty list");
        double result = 1;
        for (Number t : numbers)
            result = result * t.doubleValue();
        return result;
    }
    public static void main(String[] args) {
            List<Double> doubles = new ArrayList<>();
            doubles.add(Math.PI);
            doubles.add(Math.E);
            multiplyAll(doubles);
    }
}
