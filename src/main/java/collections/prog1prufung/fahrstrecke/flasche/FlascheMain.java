package collections.prog1prufung.fahrstrecke.flasche;

public class FlascheMain {
    public static void main(String[] args) {

        Flasche flasche = new Flasche("Wein", "trocken", 450);
        int ml = 130;
        System.out.println(flasche.reduziereFuellstand(ml) + " ml entnommen");


        while(!flasche.istLeer()){
            flasche.reduziereFuellstand(ml);
            System.out.println(ml + " ml entnommen" + " осталось в бутылке: " + flasche.getFullstand());
        }
    }
}
