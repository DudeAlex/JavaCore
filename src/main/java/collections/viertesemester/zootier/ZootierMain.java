package collections.viertesemester.zootier;

public class ZootierMain {
    public static void main(String[] args) {

        Zootier[] zootiers = new Zootier[]{
                new Lowe(),
                new Papagei(),
                new Elefant()
        };

        for(Zootier tier : zootiers){
            tier.makeSound();
        }

    }
}
