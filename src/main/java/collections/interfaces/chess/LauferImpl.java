package collections.interfaces.chess;

public class LauferImpl extends AbstractFigur implements Laufer {

    public LauferImpl(int x, int y) {
        super(x, y);
    }

    public Brett gibErlaubteFelder() {
        return null;
        //alle diagonalen Felder
    }
}
