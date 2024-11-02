package hausaufgabe.lektion20.skat.dictionary;

import java.util.*;

public class MyDictionary {

    Map<String, Collection<String>> dictionary;

    public MyDictionary(){
        this.dictionary = new HashMap<>();
    }


    public void addWort(String... words){
        if(words.length < 2) return;
        Collection<String> list = new ArrayList<>();

        for(int i = 1; i < words.length; i++){
            list.add(words[i]);
        }

        dictionary.put(words[0], list);
    }

    public Map<String, Collection<String>> getDictionary(){
        return dictionary;
    }


    public void printDictionary(){
        for(Map.Entry<String, Collection<String>> entry : dictionary.entrySet()){
            System.out.println("English wort '" + entry.getKey() + "' means " + entry.getValue() + " in german");
        }
    }

}
