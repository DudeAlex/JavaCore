package collections.linkedlist;

public class LinkedLotteryList {

    private Kugel first;

    private static class Kugel{
        int number;
        Kugel next;
        Kugel(int number){
            this.number=number;
        }

        @Override
        public String toString() {
            return "Kugel{" +
                    "number=" + number +
                    ", next=" + next +
                    '}';
        }
    }

    public void add(int number){
        Kugel newKugel = new Kugel(number);

        if(first==null){
            first = newKugel;
        }else{
            Kugel current;
            current = first;
            while (current.next != null){
                current = current.next;
            }
            current.next = newKugel;
        }
    }

    public void sort(){

        if(first == null || first.next == null){
            return;
        }

        Kugel current = first;

        do {
            Kugel start = current;

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
    private void swap(Kugel k1, Kugel k2){
        int temp = k1.number;
        k1.number = k2.number;
        k2.number = temp;
    }
    private int compareTo(Kugel k1, Kugel k2){
        return Integer.compare(k1.number, k2.number);
    }

    private int compareTo(int n1, int n2){
        return compareTo(new Kugel(n1), new Kugel(n2));
    }

    @Override
    public String toString() {
        return "LinkedLotteryList{" +
                "first=" + first +
                '}';
    }
    public void displayAll(){

        System.out.println(first);
//      Kugel current = first;
//        while (current.next != null){
//            System.out.println(current);
//            current = current.next;
//        }
    }
}
