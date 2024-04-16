package collections.linkedlist;

public class LotteryListMain {
    public static void main(String[] args) {
        LotteryList lotteryList = new LotteryList();

        lotteryList.add(16);
        lotteryList.add(11);
        lotteryList.add(22);
        lotteryList.add(10);
        lotteryList.add(49);

        System.out.println(lotteryList);

        lotteryList.sort();
        System.out.println(lotteryList);
    }
}
