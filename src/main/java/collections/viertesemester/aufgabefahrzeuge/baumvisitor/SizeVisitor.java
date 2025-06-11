package collections.viertesemester.aufgabefahrzeuge.baumvisitor;



public class SizeVisitor<T> implements Visitor<T> {
    private int count = 0;

    @Override
    public void visit(Baum.Knoten<T> current) {
        count++;
    }

    public int getCount() {
        return count;
    }
}
