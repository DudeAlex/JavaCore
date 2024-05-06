package collections.drittenPunkt;

public class PunktMain{
    public static void main(String[] args) {

        Punkt punkt = new Punkt(2,5,7);


        System.out.println(punkt.calculateDistance());
        System.out.println(punkt.toString());
    }
    
}
