package collections.Baumen;

public class BaumenMain {
    public static void main(String[] args) {

        Baumen baumen = new Baumen();

        BaumenNode h = new BaumenNode("Hello", "an expression or gesture of greeting");
        baumen.einfugen(h);
        BaumenNode w = new BaumenNode("World", "Place where we live");
        baumen.einfugen(w);
        BaumenNode a = new BaumenNode("Apelsin", "ApelsinFruit");
        baumen.einfugen(a);
        BaumenNode b = new BaumenNode("Banan", "BananFruit");
        baumen.einfugen(b);
        BaumenNode p = new BaumenNode("Paris", "City in France");
        baumen.einfugen(p);
        BaumenNode z = new BaumenNode("Zoo", "Place where animals live");
        baumen.einfugen(z);

        baumen.display();
        System.out.println(baumen.search("Apelsin"));
    }
}
