package collections.viertesemester.gerätesteuerung;

public class Computer implements Bedienbar{

    public static int sum = 0;
    @Override
    public void einschalten(){
        sum++;
        System.out.println("Computer eingeschaltet " + sum + " mal");
    }

    @Override
    public void ausschalten(){
        System.out.println("Computer ausgeschaltet");
    }


}
