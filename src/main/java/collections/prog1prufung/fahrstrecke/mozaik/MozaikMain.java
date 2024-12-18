package collections.prog1prufung.fahrstrecke.mozaik;

public class MozaikMain {
    public static void main(String[] args) {



        boolean[][] motiv = Motiv.motiv;


        Mosaikpuzzle mosaikpuzzle = new Mosaikpuzzle(motiv);
        Motiv.printMotiv();

        System.out.println();

        System.out.println(mosaikpuzzle.ermittleZahl(3, 3));
        System.out.println(mosaikpuzzle.ermittleZahl(7, 6));
        System.out.println(mosaikpuzzle.ermittleZahl(0, 2));
        System.out.println(mosaikpuzzle.ermittleZahl(9,7));

        System.out.println();

        mosaikpuzzle.printZifferMatrix();
    }
}
