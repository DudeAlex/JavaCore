package collections.buchen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BuchMain {
    public static void main(String[] args) {


        ArrayList<Buch> arrayList = new ArrayList<>();

        /*Buch b1 = new Buch("GP", 563);
        Buch b2 = new Buch("HG", 421);
        Buch b3 = new Buch("D", 123);
        Buch b4 = new Buch("WuM", 1424);*/


        arrayList.add(new Buch("GP", 563));
        arrayList.add(new Buch("HG", 421));
        arrayList.add(new Buch("D", 123));
        arrayList.add(new Buch("WuM", 1424));
        arrayList.add(new Buch("AB", 421));


        Collections.sort(arrayList);

        for(Buch buch : arrayList){
            System.out.println(buch);
        }


    }
}
