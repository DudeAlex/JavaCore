package collections.Baumen;

public class BaumenMain {
    public static void main(String[] args) {

        Baumen baumen = new Baumen();

        BaumenNode k = new BaumenNode("Hello", "an expression or gesture of greeting");

        baumen.einfuegen(k);

        BaumenNode l = new BaumenNode("World", "Place where we live");
        baumen.einfuegen(l);

        System.out.println(baumen);
    }
}
