package collections.chessaufgabe;

public class LauferImpl extends AbstractFigur implements Laufer {
    public LauferImpl(int x, int y)
    {
        super(x, y);
    }

    public Brett gibErlaubteFelder()
    {
        Brett brett = new Brett();
        //TODO: Erg�nzen Sie den Algorithmus zur Bestimmung der Felder
        return brett;
    }

    public static void main(String[] args)
    {
        LauferImpl l = new LauferImpl(4,5);
        Brett brett = l.gibErlaubteFelder();
        for (int j = 1; j <= 8; j++)
        {
            for (int i = 1; i <= 8; i++)
            {
                if (brett.gibFeld(i, j)) System.out.print("x");
                else System.out.print("o");
            }
            System.out.println();
        }
    }
}
