package collections.viertesemester.baumvisitor;

public interface Visitor<T>{
    public void visit(Baum.Knoten<T> current);
}

