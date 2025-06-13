package collections.viertesemester.fahrzeugeostap;

public class Fahrrad extends Fahrzeug{

    double tankstand = 0;

    @Override
    public void fahre(){
        System.out.println("Ich bin Fahrrad");
    }

    @Override
    public double tankstand(){
        return tankstand;
    }
}
