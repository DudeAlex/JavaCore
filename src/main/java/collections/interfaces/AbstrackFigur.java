package collections.interfaces;

public abstract class AbstrackFigur implements Figur{
    int x;
    int y;

    public AbstrackFigur(int x, int y){
        if (x >= 1 && x <= 8) this.x = x;
        if (y >= 1 && y <= 8) this.y = y;
    }
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        if (x >= 1 && x <= 8)
            this.x = x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        if (y >= 1 && y <= 8)
            this.y = y;
    }
}
