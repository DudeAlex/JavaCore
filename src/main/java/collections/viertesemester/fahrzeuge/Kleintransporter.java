package collections.viertesemester.fahrzeuge;


public class Kleintransporter extends Fahrzeug {

    @Override
    public double berechnen(Fahrt fahrt){
        if(fahrt.min <= 60) return 30 * fahrt.km;
        else{
            double restZeit = fahrt.min - 60;
            return 25 * restZeit + 30 * fahrt.km;
        }
    }



    @Override
    public void hinzufugen(Fahrt fahrt){
        fahrtList.add(fahrt);
    }
}
