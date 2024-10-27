package hausaufgabe.lektion16.schachbrett.chessaufgabe.cyborg;

public class CyborgMain {
    public static void main(String[] args) {

        Mensch mensch = new Mensch();
        Roboter roboter = new Roboter();

        System.out.println(mensch.entscheide(Situation.GEFAHR_LINKS));
        System.out.println(roboter.entscheide(Situation.GEFAHR_RECHTS));
        System.out.println(mensch.entscheide(Situation.GEFAHR_RECHTS));
        System.out.println(mensch.entscheide(Situation.GEFAHR_LINKS));
        System.out.println(mensch.entscheide(Situation.GEFAHR_VORNE));


    }
}
