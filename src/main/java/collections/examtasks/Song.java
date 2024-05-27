package collections.examtasks;

public class Song {
    private String titel;
    private String interpret;
    private double dauer;

    public Song(String titel, String interpret, double dauer){
        this.titel = titel;
        this.interpret = interpret;
        if(dauer < 0) throw new RuntimeException();
        this.dauer = dauer;
    }

    public String getTitel(){
        return titel;
    }

    public void setTitel(String titel){
        this.titel = titel;
    }

    public String getInterpret(){
        return interpret;
    }

    public void setInterpret(String interpret){
        this.interpret = interpret;
    }

    public double getDauer(){
        return dauer;
    }

    public void setDauer(double dauer){
        this.dauer = dauer;
    }
}
