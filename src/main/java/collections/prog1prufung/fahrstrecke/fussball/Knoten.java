package collections.prog1prufung.fahrstrecke.fussball;

public class Knoten {

    private Mannschaft mannschaft;
    Knoten right;
    Knoten left;


    public Knoten(Mannschaft mannschaft){
       this.mannschaft = mannschaft;
    }

    public Mannschaft getMannschaft() {
        return mannschaft;
    }

    public void setMannschaft(Mannschaft mannschaft) {
        this.mannschaft = mannschaft;
    }

    public Knoten getRight() {
        return right;
    }

    public void setRight(Knoten right) {
        this.right = right;
    }

    public Knoten getLeft() {
        return left;
    }

    public void setLeft(Knoten left) {
        this.left = left;
    }
}
