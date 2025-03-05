package hausaufgabe.lektion22.primzahlen;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Primzahlen implements Runnable{

    List<Integer> integerList;
    Map<Integer, Boolean> map;

    public Primzahlen (List<Integer> integerList, Map<Integer, Boolean> map){
        this.integerList = integerList;
        this.map = map;
    }


    @Override
    public void run(){
        for(Integer number : integerList){
            if(number % 3 == 0){
                map.put(number, true);
            }
        }
    }
}
