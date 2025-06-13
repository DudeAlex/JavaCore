package collections.viertesemester.fahrzeugeostap;

public class Elektroauto extends Fahrzeug{

    double tankstand = 80.0;

    @Override
    public void fahre(){
        System.out.println("Ich bin Elektroauto");

    }

    @Override
    public double tankstand(){
        return tankstand;
    }
}
