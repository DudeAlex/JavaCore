package collections.viertesemester.gerätesteuerung;

public class Lampe implements Bedienbar{

    @Override
    public void einschalten(){
        System.out.println("Lampe Eingeschaltet");
    }

    @Override
    public void ausschalten(){
        System.out.println("Lampe Ausgeschaltet");
    }
}
