package hausaufgabe.lektion22.baumvisitor;


public class Baum<E extends Comparable<E>> {

    int count = 0;
    public static class Knoten<E> {
        Knoten<E> left;
        Knoten<E> right;
        E content;
    }
    Knoten<E> root;
    /*
Дополните класс Tree методом size, который создает экземпляр
 вашей реализации Visitor из подзадачи a), вызывает метод обхода
  и возвращает количество элементов, подсчитанных посетителем.
 */
    public int size(){
        Visitor<E> visitor = new Visitor<E>(){
            @Override
            public void visit(Knoten<E> current) {
                count++;
            }
        };

        return count;
    }
    public void einfuegen(E content) {

    }
    protected void traversiere(Visitor<E> visitor) {
        if (root == null) return;
        else traversiere(root, visitor);
    }

    protected void traversiere(Knoten<E> current, Visitor<E> visitor){
        if (current.left != null) traversiere(current.left, visitor);
        visitor.visit(current);
        if (current.right != null) traversiere(current.right, visitor);
    }
}
