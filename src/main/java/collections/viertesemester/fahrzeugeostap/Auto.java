package collections.viertesemester.fahrzeugeostap;

public class Auto extends Fahrzeug{

    double tankstand = 60.0;

    @Override
    public void fahre(){
        System.out.println("Ich bin Auto");
    }

    @Override
    public double tankstand(){
        return tankstand;
    }
}
