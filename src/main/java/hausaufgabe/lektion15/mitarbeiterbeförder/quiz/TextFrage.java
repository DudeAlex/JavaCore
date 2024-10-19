package hausaufgabe.lektion15.mitarbeiterbeförder.quiz;

public class TextFrage extends Frage{

    @Override
    public void fragen(){
        System.out.println("Frage: " + getFrage());
    }

}
