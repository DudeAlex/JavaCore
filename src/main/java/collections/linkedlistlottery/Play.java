package collections.linkedlistlottery;

public class Play {
    public static void main(String[] args) {
       LinkedLotteryList list = new LinkedLotteryList();

       list.add(80);
       list.add(90);
       list.add(20);
       list.add(30);
       list.add(50);
       list.add(40);
       list.add(70);
       list.add(60);
       list.add(10);



        System.out.println(list);

        list.sort();
        System.out.println(list);

        // Collections.sort(list);
    }
}
