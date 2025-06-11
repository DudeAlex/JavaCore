package collections.viertesemester.aufgabefahrzeuge.baumvisitor;

import hausaufgabe.lektion22.baumvisitor.Baum;

public class BaumVisitorMain {
    public static void main(String[] args) {
        Baum<Integer> baum = new Baum<>();
        baum.einfuegen(5);
        baum.einfuegen(3);
        baum.einfuegen(7);
        baum.einfuegen(1);

        System.out.println("Anzahl der Knoten: " + baum.size());
    }
}
