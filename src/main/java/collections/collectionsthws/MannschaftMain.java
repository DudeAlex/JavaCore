package collections.collectionsthws;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MannschaftMain {
    public static void main(String[] args) {
        List<Mannschaft> tabelle = new ArrayList<Mannschaft>(18);
        tabelle.add(new Mannschaft(1, "Bay.München", 32, 75, 15, 82));
        tabelle.add(new Mannschaft(2, "Bor.Dortmund", 32, 52, 36, 77));
        tabelle.add(new Mannschaft(3, "B.Leverkusen", 32, 80, 31, 57));
        tabelle.add(new Mannschaft(4, "B.M'gladbach", 32, 64, 49, 49));
        tabelle.add(new Mannschaft(5, "Hertha BSC", 32, 41, 40, 49));
        tabelle.add(new Mannschaft(6, "FC Schalke 04", 32, 46, 47, 48));
        tabelle.add(new Mannschaft(7, "FSV Mainz 05", 32, 43, 41, 46));
        tabelle.add(new Mannschaft(8, "1.FC Köln", 32, 36, 40, 41));
        tabelle.add(new Mannschaft(9, "FC Ingolstadt", 32, 30, 37, 40));
        tabelle.add(new Mannschaft(10, "VfL Wolfsburg", 32, 43, 48, 39));
        tabelle.add(new Mannschaft(11, "Hamburger SV", 32, 37, 44, 38));
        tabelle.add(new Mannschaft(12, "FC Augsburg", 32, 40, 48, 37));
        tabelle.add(new Mannschaft(13, "Hoffenheim", 32, 38, 49, 37));
        tabelle.add(new Mannschaft(14, "Darmstadt 98", 32, 36, 50, 35));
        tabelle.add(new Mannschaft(15, "Werder Bremen", 32, 49, 65, 34));
        tabelle.add(new Mannschaft(16, "VfB Stuttgart", 32, 48, 69, 33));
        tabelle.add(new Mannschaft(17, "Ein.Frankfurt", 32, 33, 51, 33));
        tabelle.add(new Mannschaft(18, "Hannover 96", 32, 29, 59, 22));
        for (Mannschaft mannschaft : tabelle)
            System.out.println(mannschaft);

        Collections.sort(tabelle);
        System.out.println();

        for (Mannschaft mannschaft : tabelle)
            System.out.println(mannschaft);

        System.out.println();

    for(int i = 0; i<tabelle.size();i++)

    {
        Mannschaft mannschaft = tabelle.get(i);
        System.out.printf("%3s %s\n", i + 1, mannschaft);
    }
}
}
