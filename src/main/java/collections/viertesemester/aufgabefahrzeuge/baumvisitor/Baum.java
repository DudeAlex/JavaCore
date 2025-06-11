package collections.viertesemester.aufgabefahrzeuge.baumvisitor;

public class Baum<E extends Comparable<E>> {

    public static class Knoten<E> {
        Knoten<E> left;
        Knoten<E> right;
        E content;
    }

    Knoten<E> root;

    public void einfuegen(E content) {
        Knoten<E> neuerKnoten = new Knoten<>();
        neuerKnoten.content = content;

        while(true){
            if(root == null){
                root = neuerKnoten;
                return;
            }

            Knoten<E> current = root;
            if(content.compareTo(current.content) < 0){
                if(current.left == null){
                    current.left = neuerKnoten;
                    return;
                }
                current = current.left;
            } else{
                if(content.compareTo(current.content) > 0){
                    if(current.right == null){
                        current.right = neuerKnoten;
                        return;
                    }
                    current = current.right;
                }
            }
        }
    }

    protected void traversiere(Visitor<E> visitor) {
        if (root == null) return;
        traversiere(root, visitor);
    }

    protected void traversiere(Knoten<E> current, Visitor<E> visitor) {
        if (current.left != null) traversiere(current.left, visitor);
        visitor.visit(current);
        if (current.right != null) traversiere(current.right, visitor);
    }

    public int size() {
        SizeVisitor<E> visitor = new SizeVisitor<>();
        traversiere(visitor);
        return visitor.getCount();
    }
}
