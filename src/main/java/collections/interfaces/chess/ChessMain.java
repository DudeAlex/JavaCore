package collections.interfaces.chess;

public class ChessMain {
    public static void main(String[] args) {

        Turm turm = new TurmImpl(4,5);
        turm.gibErlaubteFelder();
    }
}
