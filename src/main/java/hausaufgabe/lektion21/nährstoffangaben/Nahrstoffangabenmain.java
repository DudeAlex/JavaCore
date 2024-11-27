package hausaufgabe.lektion21.nährstoffangaben;

public class Nahrstoffangabenmain {
    public static void main(String[] args) {

        Nahrstoffangaben nahrstoffangaben = new Nahrstoffangaben.NarhrstoffangabenBuilder(150.50, 6).build();

        Nahrstoffangaben nahrstoffangaben1 = new Nahrstoffangaben.NarhrstoffangabenBuilder(12.6, 3)
                .withEiweiß(12.4)
                .withFett(34.6)
                .build();


        System.out.println(nahrstoffangaben1.toString());
        System.out.println();
        System.out.println(nahrstoffangaben.toString());
    }
}
