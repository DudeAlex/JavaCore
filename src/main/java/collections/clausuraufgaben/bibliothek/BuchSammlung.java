package collections.clausuraufgaben.bibliothek;

import java.util.*;

public class BuchSammlung {

    List<Buch> buecher;

    public BuchSammlung(){
        this.buecher = new ArrayList<>();
    }

    public void sortiereNachAutorUndName(){
        Collections.sort(buecher, new Comparator<Buch>() {
            @Override
            public int compare(Buch b1, Buch b2) {
                int autorVergleich = b1.autor.compareTo(b2.autor);
                if(autorVergleich != 0){
                    return autorVergleich;
                }
                return b1.name.compareTo(b2.name);
            }
        });
    }


}
