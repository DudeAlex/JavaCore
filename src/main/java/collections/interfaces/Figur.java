package collections.interfaces;

public abstract class Figur {
    int x;
    int y;

    public abstract Brett gibErlaubteFelder();

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
