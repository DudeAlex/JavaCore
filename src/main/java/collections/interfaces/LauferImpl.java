package collections.interfaces;

public class LauferImpl extends AbstrackFigur implements Laufer {


    public LauferImpl(int x, int y) {
        super(x, y);
    }

    @Override
    public Brett gibErlaubteFelder() {
        return null;
    }
}
