package collections.interfaces;

public class ChessMain {
    public static void main(String[] args) {
        Turm turm = new TurmImpl(2,4);

        LauferImpl laufer = new LauferImpl(1,3);

        Dame dame = new Dame(5,1);
        Turm dameTurm = new Dame(2,4);
        Laufer dameLaufer = new Dame(1,6);
        AbstrackFigur dameFigur = new Dame(6,2);
        Object dameObject = new Dame(4,6);

        





    }
}
