package collections.chessaufgabe;

public class Brett {
    boolean[][] brett = new boolean[8][8];

    public Brett kombiniere(Brett brett) {
        return null;
    }

    public void markiereFeld(int x, int y) {
        brett[x-1][y-1] = true;
    }

    public boolean gibFeld(int x, int y) {
        return brett[x-1][y-1];
    }
}
