package collections.interfaces.chess;

public class Dame extends AbstractFigur implements Laufer, Turm {

    Laufer laufer;
    Turm turm;

    public Dame(int x, int y) {
        super(x, y);
        laufer = new LauferImpl(x, y);
        turm = new TurmImpl(x,y);
    }

    @Override
    public Brett gibErlaubteFelder() {
        Brett brettLaufer = laufer.gibErlaubteFelder();
        Brett brettTurm = turm.gibErlaubteFelder();
        Brett kombiniertesBrett = brettTurm.kombiniere(brettLaufer);
        return kombiniertesBrett;
    }

    @Override
    public void setX(int x)
    {
        laufer.setX(x);
        turm.setX(x);
        if (x >= 1 && x <= 8)
            this.x = x;
    }
    @Override
    public void setY(int y)
    {
        laufer.setY(y);
        turm.setY(y);
        if (y >= 1 && y <= 8)
            this.y = y;
    }

}
