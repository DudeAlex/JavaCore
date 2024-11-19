package collections.clausuraufgaben.fahrzeuge;

public class Fahrrad extends Fahrzeug{


    @Override
    public double berechnen(Fahrt fahrt){
        return 12.5 * fahrt.min;
    }

    @Override
    public void einfugen(Fahrt fahrt){

    }


}
