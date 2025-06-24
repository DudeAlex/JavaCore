package collections.viertesemester.iteratoreigenecollection;

import java.util.Iterator;

public class IntRange implements Iterable<Integer> {

    int from;
    int to;

    public IntRange(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Iterator<Integer> iterator() {

        return new IntRangeIterator();
    }

    private class IntRangeIterator implements Iterator<Integer>{

        private int current = from;

        @Override
        public boolean hasNext(){
            return current <= to;
        }

        @Override
        public Integer next(){
            return current++;
        }
    }


}
