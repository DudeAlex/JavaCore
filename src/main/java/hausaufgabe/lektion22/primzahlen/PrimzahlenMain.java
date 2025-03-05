package hausaufgabe.lektion22.primzahlen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimzahlenMain {
    public static void main(String[] args) throws InterruptedException {


        Map<Integer, Boolean> map = new HashMap<>();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(24);
        integerList.add(13);
        integerList.add(19);
        integerList.add(64);
        integerList.add(39);



        for(int i = 1; i < 3; i++){
            Thread t = new Thread(new Primzahlen(integerList, map));

            t.setName("Thread " + i);
            t.start();
            t.join();

        }
        System.out.println(map);
    }
}
