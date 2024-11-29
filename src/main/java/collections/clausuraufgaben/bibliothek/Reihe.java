package collections.clausuraufgaben.bibliothek;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Reihe {

    String name;
    List<Buch> buecher;

    public Reihe(String name){
        this.name = name;
        this.buecher = new ArrayList<>();
    }

    public void addBuch(Buch buch){
        if(buch != null) buecher.add(buch);
    }

    public List<Buch> getBuch(){
        return buecher;
    }

}
