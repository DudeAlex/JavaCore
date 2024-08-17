package collections.interfaces.chess;

public class TurmImpl extends AbstractFigur implements Turm {

    public TurmImpl (int x, int y){
        super(x, y);
    }

    public Brett gibErlaubteFelder() {
        return null;
        //alle Vertikale und Horizontale Felder
    }
}

