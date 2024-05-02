package collections.vararg;

public class VarargTest {
    public static void main(String[] args) {

        System.out.println(concat("Hello"));
        System.out.println(concat("Hello", "Welt"));
        System.out.println(concat("Hello", "Welt", "!"));

        String[] h = {"Hello", "Welt", "!"};
        //System.out.println(h);

        System.out.println(maxWort("Hello"));
        System.out.println(maxWort("Hello", "Weltsdgsgsgsgs"));
        System.out.println(maxWort("Hello", "Welttttt", "!"));
        System.out.println();

        System.out.println(concat(h));
        System.out.println(maxWort(h));


    }

    public static String maxWort(String... strings){
        String maxWort = strings[0];
        for (int i = 0; i < strings.length; i++) {
            if(maxWort.length() < strings[i].length()){
                maxWort = strings[i];
            }
        }
        return maxWort;
    }

    public static String concat(String... strings) {
        String result = ""; for (int i = 0; i < strings.length; i++) {
            result += strings[i];
            if (i != strings.length - 1) result += ", "; }
        return result;
    }
}
