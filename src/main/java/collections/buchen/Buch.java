package collections.buchen;


import java.util.ArrayList;

public class Buch implements Comparable<Buch> {

    String titel;
    int seiten;

    public Buch(String titel, int seiten){
        this.titel = titel;
        this.seiten = seiten;
    }


    public int compareTo(Buch b){
        if(this.seiten != b.seiten) {
            return Integer.compare(b.seiten, this.seiten);
        }
        return this.titel.compareTo(b.titel);
    }

    @Override
    public String toString(){
        return "Titel " + titel + " seiten: " + seiten;
    }
}
