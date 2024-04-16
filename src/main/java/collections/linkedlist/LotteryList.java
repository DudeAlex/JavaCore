package collections.linkedlist;

public class LotteryList {
    private Kreis first;

    private static class Kreis{
        int number;
        Kreis next;
        Kreis(int number){
            this.number=number;
        }

        @Override
        public String toString() {
            return "Kreis{" +
                    "number=" + number +
                    ", next=" + next +
                    '}';
        }
    }
    public void add(int number){
        Kreis newKreis = new Kreis(number);

        if (first == null){
            first = newKreis;
        } else{
            Kreis current;
            current = first;
            while(current.next != null){
                current = current.next;
            }
            current.next = newKreis;
        }
    }

    @Override
    public String toString() {
        return "LotteryList{" +
                "first=" + first +
                '}';
    }

    private int compareTo(Kreis k1, Kreis k2){
        return Integer.compare(k1.number, k2.number);
    }

    private void swap(Kreis k1, Kreis k2){
        int temp = k1.number;
        k1.number = k2.number;
        k2.number = temp;
    }

    public void sort(){

        if(first == null || first.next == null){
            return;
        }

        Kreis current = first;

        do {
            Kreis start = current;

            do {
                if (compareTo(current, start) > 0) {
                    swap(current, start);
                }
                start = start.next;
            }
            while (start != null);

            current = current.next;
        }
        while(current != null);
    }
}
