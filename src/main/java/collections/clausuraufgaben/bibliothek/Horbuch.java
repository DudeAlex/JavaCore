package collections.clausuraufgaben.bibliothek;

import java.util.HashMap;

public class Horbuch extends Buch {

    String sprecher;
    double dauer;

    public Horbuch(String name, String autor, String verlag, int preisInCents, String sprecher, double dauer){
        super(name, autor, verlag, preisInCents);
        this.sprecher = sprecher;
        this.dauer = dauer;
    }


}
