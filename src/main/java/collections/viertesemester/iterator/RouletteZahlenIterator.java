package collections.viertesemester.iterator;

import java.util.Iterator;

public class RouletteZahlenIterator implements Iterator<Integer> {

    private int sum = 0;
    private int nextNumber;


    @Override
    public boolean hasNext() {

        if(nextNumber == 0) sum++;

        return sum <= 3;
    }

    @Override
    public Integer next() {
        nextNumber = (int) (Math.random() * 36);
        return nextNumber;

    }
}
