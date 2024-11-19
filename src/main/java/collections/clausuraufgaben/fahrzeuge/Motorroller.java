package collections.clausuraufgaben.fahrzeuge;

public class Motorroller extends Fahrzeug{

    final double price = 315.0;


    @Override
    public double berechnen(Fahrt fahrt){
        return price * fahrt.min;
    }

    @Override
    public void einfugen(Fahrt fahrt){
        Fahrzeug fahrzeug = new Fahrzeug();
    }


}
