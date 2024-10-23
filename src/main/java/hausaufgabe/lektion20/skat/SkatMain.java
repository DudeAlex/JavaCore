package hausaufgabe.lektion20.skat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SkatMain {
    public static void main(String[] args) {



        Skat skat1 = new Skat("Valet", "Pik");
        Skat skat2 = new Skat("König", "Tref");
        Skat skat3 = new Skat("10", "Herz");
        Skat skat4 = new Skat("Ass", "Karo");
        Skat skat5 = new Skat("Dame", "Herz");
        Skat skat6 = new Skat("8", "Pik");
        Skat skat7 = new Skat("9", "Pik");
        Skat skat8 = new Skat("König", "Herz");
        Skat skat9 = new Skat("Dame", "Herz");
        Skat skat10 = new Skat("Ass", "Karo");


        List<Skat> skats = Arrays.asList(skat1, skat2, skat3, skat4, skat5, skat6, skat7, skat8, skat9, skat10);

        Collections.sort(skats);

        for(Skat skat : skats){
            System.out.println(skat);
        }

    }
}
