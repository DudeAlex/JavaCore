package hausaufgabe.lektion19.objektinputoutput.gloves;

public class GlovesMain {
    public static void main(String[] args) {
        Glove g1 = new Glove(true);
        Glove g2 = new Glove(true);
        PairOfGloves pair = new PairOfGloves(g1, g2);
        System.out.println(pair);
        Glove left = pair.getLeft();
        System.out.println(left.toString());
    }
}
