package collections.viertesemester.fahrzeuge;

public class Motoroller extends Fahrzeug{

    @Override
    public double berechnen(Fahrt fahrt){
        return 300 + 15 * fahrt.km;
    }

    @Override
    public void hinzufugen(Fahrt fahrt){
        fahrtList.add(fahrt);
    }
}
