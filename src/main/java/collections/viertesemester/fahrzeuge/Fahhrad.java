package collections.viertesemester.fahrzeuge;

public class Fahhrad extends Fahrzeug{

    @Override
    public double berechnen(Fahrt fahrt){
        return 12.5 * fahrt.min;
    }

    @Override
    public void hinzufugen(Fahrt fahrt){
        fahrtList.add(fahrt);
    }

}
