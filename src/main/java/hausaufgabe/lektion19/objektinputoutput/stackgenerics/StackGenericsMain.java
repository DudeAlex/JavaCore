package hausaufgabe.lektion19.objektinputoutput.stackgenerics;

public class StackGenericsMain {
    public static void main(String[] args) {

        StackGenerics<String> stackGenerics = new StackGenerics<>();

        stackGenerics.push("Hallo");
        stackGenerics.push("Welt");
        System.out.println(stackGenerics.pop());
        System.out.println(stackGenerics.pop());

    }
}
