package collections.prog1prufung.fahrstrecke.onlineschop;

public class OnlineshopMain {
    public static void main(String[] args) {

        Artikel lavash = new Artikel(123, "Lavash");
        Artikel burger = new Artikel(323, "Burger");
        Artikel pizza = new Artikel(523, "Pizza");


        Bestellung bestellung = new Bestellung();
        bestellung.add(lavash);
        bestellung.add(burger);
        bestellung.add(pizza);
    }
}
