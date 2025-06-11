package hausaufgabe.lektion23.ListofAsList.bundesliga;

import java.util.ArrayList;
import java.util.List;

import static java.lang.CharSequence.compare;

public class Ubung {
    public static void main(String[] args) {

        List<Mannschaft> tabelle = Mannschaft.createTabelle();

        /*tabelle.stream().filter(team -> team.punkte > 50)
                .forEach(team -> System.out.println(team));

        tabelle.stream().map(team -> team.name)
                .forEach(team -> System.out.println(team));*/


        tabelle.stream().filter(team -> team.name.startsWith("F"))
                .sorted((team1, team2) -> compare(team1.name, team2.name))
                .forEach(team -> System.out.println(team));

        System.out.println();

        tabelle.stream().max((team1, team2) -> Integer.compare(team1.tore, team2.tore))
                .ifPresent(System.out::println);


    }

}
