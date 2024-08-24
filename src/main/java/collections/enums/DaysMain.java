package collections.enums;

public class DaysMain {
    public static void main(String[] args) {
        System.out.println("Shmanday");
        getDay(Days.TUESDAY);

        System.out.println(Days.WEDNESDAY.getNummer());
        System.out.println(Days.WEDNESDAY.compareTo(Days.MONDAY));
        System.out.println(Days.WEDNESDAY.ordinal());
    }
    public static void getDay(Days day){
        System.out.println(day);
    }

}
