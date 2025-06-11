package hausaufgabe.lektion22.baumvisitor;

import hausaufgabe.lektion22.baumvisitor.Baum.Knoten;

public interface Visitor<T> {
    void visit(Knoten<T> current);
}
