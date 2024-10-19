package hausaufgabe.lektion15.mitarbeiterbeförder.quiz;

public class MultipleChoiceFrage extends Frage {

    private String[] antwort;

    @Override
    public void fragen(){
        String[] varianten = {"A", "B", "C", "D"};
        System.out.println("Frage: " + getFrage());
        for(int i = 0; i < antwort.length; i++){
            System.out.println(varianten[i] + " " + antwort[i]);
        }
    }


    public String[] getFragen() {
        return antwort;
    }
    public void setAntwort(String[] antwort){
        this.antwort = antwort;
    }
}
