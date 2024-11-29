package collections.clausuraufgaben.bibliothek;

import java.util.*;

public class Bibliothek {

    private List<Buch> buecher;
    BuchSammlung buchSammlung;

    public Bibliothek(){
        this.buecher = new ArrayList<>();
        this.buchSammlung = new BuchSammlung();
    }

    public void addBuecher(List<Buch> neueBuecher){
        buecher.addAll(neueBuecher);
        sortiereBuecher();
    }

    private void sortiereBuecher(){
        buchSammlung.sortiereNachAutorUndName();
    }
}
