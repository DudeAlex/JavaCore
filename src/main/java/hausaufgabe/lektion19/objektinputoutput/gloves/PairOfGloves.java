package hausaufgabe.lektion19.objektinputoutput.gloves;

public class PairOfGloves {
    private Glove left;
    private Glove right;
    public PairOfGloves(Glove l, Glove r) {
        this.left = l;
        this.right = r;
    }
    public Glove getLeft() {
        return left;
    }
    public Glove getRight() {
        return right;
    }
    public String toString() {
        return "(l=" + left.toString() +
                ", r=" + right.toString() + ")";
    }
}
