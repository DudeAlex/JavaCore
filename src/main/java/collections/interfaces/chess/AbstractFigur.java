package collections.interfaces.chess;

public abstract class AbstractFigur implements Figur {
    int x;
    int y;

    public AbstractFigur(int x, int y) {
        setX(x);
        setY(y);
    }

        public int getX() {
        return x;
    }
    public void setX(int x) {
        if (x >= 1 && x <= 8)
            this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        if (y >= 1 && y <= 8)
            this.y = y;
    }
}
