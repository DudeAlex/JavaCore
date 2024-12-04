package collections.prog1prufung.fahrstrecke.onlineschop;

public class Artikel {

    int nummer;
    String name;

    public Artikel(int nummer, String name) {
        this.nummer = nummer;
        this.name = name;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
