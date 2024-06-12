package collections.interfaces.aggregation;

public class Main {
    public static void main(String[] args) {

        Auto bmw = new Auto();
        System.out.println(bmw.motor);

        Address adr1 = new Address();
        Address adr2 = new Address();
        Address adr3 = new Address();
        Address adr4 = new Address();

        Person ivan = new Person(adr3);
        System.out.println(ivan.address);
    }
}
