package hausaufgabe.lektion15.mitarbeiterbeförder.quiz;

public abstract class Frage {
    private String frage;
    private String antwort;

    public abstract void fragen();


    public String getFrage() {
        return frage;
    }

    public void setFrage(String frage) {
        this.frage = frage;
    }

    public String getAntwort() {
        return antwort;
    }

    public void setAntwort(String antwort) {
        this.antwort = antwort;
    }
}
