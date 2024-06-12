package collections.interfaces;
public class Dame extends AbstrackFigur implements Turm, Laufer {

    Laufer laufer;
    Turm turm;
    public Dame(int x, int y) {
        super(x, y);
        laufer = new LauferImpl(x,y);
        turm = new TurmImpl(x,y);
    }

    @Override
    public Brett gibErlaubteFelder() {
        Brett brettLaufer = laufer.gibErlaubteFelder();
        Brett brettTurm = turm.gibErlaubteFelder();
        Brett brettDame = brettLaufer.kombiniere(brettTurm);
        return brettDame;
    }
    @Override
    public void setX(int x){
        laufer.setX(x);
        turm.setX(x);
        if(x >= 1 && x <= 8)
            this.x = x;
    }

    @Override
    public void setY(int y){
        laufer.setY(y);
        turm.setY(y);
        if(y >= 1 && y <= 8)
            this.y = y;
    }
}
