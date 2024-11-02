package hausaufgabe.lektion20.skat.dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//to clean -> reinigen, säubern, putzen
//to expand -> vergrößern, wachsen
public class MyDictionaryMain {
    public static void main(String[] args) {

        MyDictionary myDictionary = new MyDictionary();

        myDictionary.addWort("clean", "reinigen", "säubern", "putzen");
        myDictionary.addWort("expand", "vergrößern", "wachsen", "vergrößern");


        myDictionary.printDictionary();
        //System.out.println(myDictionary.getDictionary());
    }
}
