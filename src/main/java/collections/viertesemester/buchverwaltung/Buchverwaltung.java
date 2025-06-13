package collections.viertesemester.buchverwaltung;

public class Buchverwaltung {
    public static void main(String[] args) {

        Buch[] buches = {
                new Lehrbuch("Informatik", "Java", "Zilker"),
                new Lehrbuch("SAp", "Busines Software", "Liebstückel"),
                new Roman("Fantasie", "Harry Potter", "J.K Rowling"),
                new Roman("Fantasie", "Hunger Gamesr", "Qwertyu"),
        };

        for(Buch b : buches){
            b.zeigeInfo();
        }
    }
}
