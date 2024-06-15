package collections.interfaces.rechteck;

public class Main {
    public static void main(String[] args) {

        Rechteck rechteck = new Rechteck(2.3,1.5);
        Quader quader1 = new Quader(rechteck, 3.1);

        Quader quader2 = new Quader(2.3, 1.5, 3.1);

        System.out.println(quader1.berechneVolumen());
        System.out.println(quader2.berechneVolumen());

    }
}
