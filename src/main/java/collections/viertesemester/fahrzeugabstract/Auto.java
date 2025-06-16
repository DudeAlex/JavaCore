package collections.viertesemester.fahrzeugabstract;

public class Auto extends Fahrzeug{

    final int maxGeschwindigkeit = 200;


    public Auto() {
        this.geschwindigkeit = 40;
    }


    @Override
    public void beschleunige(int delta){
        if (geschwindigkeit > maxGeschwindigkeit) {
            geschwindigkeit = maxGeschwindigkeit;
        }
        System.out.println("Aktuelle Geschwindigkeit ist " + geschwindigkeit);

    }

}
