package hausaufgabe.lektion16.schachbrett.chessaufgabe;

public class Dame extends AbstractFigur implements Laufer, Turm {
        Laufer laufer;
        Turm turm;

  public Dame(int x, int y) {
      super(x, y);
      laufer = new LauferImpl(x, y);
      turm = new TurmImpl(x, y);
  }

        @Override
        public Brett gibErlaubteFelder() {
            Brett brettLaufer = laufer.gibErlaubteFelder();
            Brett brettTurm = turm.gibErlaubteFelder();
            Brett kombiniertesBrett = brettTurm.kombiniere(brettLaufer);
            return kombiniertesBrett;
        }
        public static void main(String[] args) {
           Dame d = new Dame(4,5);
           System.out.println(d.gibErlaubteFelder());
           Brett brett = d.gibErlaubteFelder();
            for (int j = 1; j <= 8; j++) {
                for (int i = 1; i <= 8; i++) {
                    if (brett.gibFeld(i, j)) System.out.print("x");
                    else System.out.print("o");
                }
                System.out.println();
            }
        }
}
