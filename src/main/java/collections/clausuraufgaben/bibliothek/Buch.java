package collections.clausuraufgaben.bibliothek;

public abstract class Buch {

    String name;
    String autor;
    String verlag;
    int preisInCents;

    public Buch(String name, String autor, String verlag, int preisInCents) {
        this.name = name;
        this.autor = autor;
        this.verlag = verlag;
        this.preisInCents = preisInCents;
    }
}
