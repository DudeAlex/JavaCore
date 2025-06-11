package collections.viertesemester.aufgabefahrzeuge.twotter;

import java.util.ArrayList;
import java.util.List;

public class Twotter {
    public static void main(String[] args) {

        List<User> people = new ArrayList<>();
        User tom = new User("Tom", "Qwertyuiop");
        people.add(tom);
        User sam = new User("Sam", "Asdfghjkl");
        people.add(sam);


        TwotterSystem system = new TwotterSystem();

        system.addMessage(tom, new Message("Hello World!"));
    }
}
