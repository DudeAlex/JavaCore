package collections.prog1prufung.fahrstrecke.fussball;

public class Mannschaft {

    String name;

    private int toren = 0;
    private int gegenToren = 0;

    public Mannschaft(String  name){
        this.name = name;
    }

    public void addResult(int toren, int gegenToren){
        this.toren += toren;
        this.gegenToren += gegenToren;
    }

    public String toString(){
        return "Result: " + name + " toren: " + toren + ", gegenToren: " + gegenToren;
    }

    public int getToren() {
        return toren;
    }
}
