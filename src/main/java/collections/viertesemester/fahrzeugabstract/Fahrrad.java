package collections.viertesemester.fahrzeugabstract;

public class Fahrrad extends Fahrzeug{


    final int maxGeschwindigkeit = 40;

    public Fahrrad() {
        this.geschwindigkeit = 5;
    }

    @Override
    public void beschleunige(int delta){
        do{
            geschwindigkeit += delta;
            System.out.println("Aktuelle geschwindigkeit ist " + geschwindigkeit);
        } while (geschwindigkeit <= maxGeschwindigkeit);
        System.out.println("Max geschwindigkeit " + maxGeschwindigkeit + " erreicht");
    }
}
