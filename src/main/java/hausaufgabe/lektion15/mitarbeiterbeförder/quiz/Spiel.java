package hausaufgabe.lektion15.mitarbeiterbeförder.quiz;

import java.util.Scanner;

public class Spiel {

    public void lassunsspielen(Frage[] frages){
        for (int i = 0; i < frages.length; i++) {
            frages[i].fragen();
            Scanner scanner = new Scanner(System.in);
            String userAntwort = scanner.nextLine();
            if(userAntwort.equals(frages[i].getAntwort())) {
                System.out.println("Richtig!");
            } else System.out.println("Falsch!");
        }
    }

}
