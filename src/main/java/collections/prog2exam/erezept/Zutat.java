package collections.prog2exam.erezept;

public class Zutat {

    String name;
    double menge;
    Typ typ;

    public Zutat(String name, double menge, Typ typ){
        this.name = name;
        this.menge = menge;
        this.typ = typ;
    }
}
