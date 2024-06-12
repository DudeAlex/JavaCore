package collections.interfaces;

public class TurmImpl extends AbstrackFigur implements Turm{

    public TurmImpl(int x, int y) {
        super(x, y);
    }

    @Override
    public Brett gibErlaubteFelder() {
        return null;
    }
}
