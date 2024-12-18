package collections.prog1prufung.fahrstrecke.fussball;

public class FussbalMain {
    public static void main(String[] args) {


        Mannschaft deutschland = new Mannschaft("Deutschland");

        System.out.println(deutschland.toString());

        deutschland.addResult(3, 2);
        System.out.println(deutschland.toString());
        deutschland.addResult(1,3);
        System.out.println(deutschland.toString());
        Mannschaft bavaria = new Mannschaft("Deutschland");
        Mannschaft borissia = new Mannschaft("Deutschland");
        Mannschaft koln = new Mannschaft("Deutschland");
        Mannschaft mainz = new Mannschaft("Deutschland");


    }
}
