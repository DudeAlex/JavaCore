package collections.clausuraufgaben.bibliothek;

import java.util.HashMap;

public class GebundenesBuch extends Buch{

    int seitenzahl;

    public GebundenesBuch(String name, String autor, String verlag, int preisInCents, int seitenzahl){
        super(name, autor, verlag, preisInCents);
        this.seitenzahl = seitenzahl;
    }


    HashMap<String, String> banden = new HashMap<>();



}
