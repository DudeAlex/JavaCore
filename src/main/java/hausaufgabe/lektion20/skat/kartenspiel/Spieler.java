package hausaufgabe.lektion20.skat.kartenspiel;

import hausaufgabe.lektion20.skat.Skat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Spieler {

    private String name;
    private List<Skat> cards;

    public Spieler(String name){
        this.name = name;
        this.cards = populateCard();
    }


    private List<Skat> populateCard(){
        final List<String> cardNameList = List.of("Valet", "Ass", "10", "König", "Dame", "9", "8", "7");
        final List<String> cardTypeList = List.of("Tref", "Pik", "Herz", "Karo");


        /*List<String> cardNameList = new ArrayList<>();
        cardNameList.add("Valet");
        cardNameList.add("Ass");
        cardNameList.add("10");
        cardNameList.add("König");
        cardNameList.add("Dame");
        cardNameList.add("9");
        cardNameList.add("8");
        cardNameList.add("7");
        List<String> cardTypeList = new ArrayList<>();
        cardTypeList.add("Tref");
        cardTypeList.add("Pik");
        cardTypeList.add("Herz");
        cardTypeList.add("Karo");*/



        List<Skat> listSkat = new ArrayList<>();


        Random randomName = new Random();
        Random randomType = new Random();



        // Генерируем и выводим 10 случайных чисел от 1 до 5
        for (int i = 0; i < 5; i++) {
            int randomNameNumber = randomName.nextInt(8);
            int randomTypeNumber = randomType.nextInt(4);

            Skat newSkat = new Skat(cardNameList.get(randomNameNumber), cardTypeList.get(randomTypeNumber));

            if(listSkat.isEmpty()) listSkat.add(newSkat);
            boolean duplicateFound = false;
            for(Skat oldSkat : listSkat){
                if(oldSkat.compareTo(newSkat) == 0) duplicateFound = true;
            }
            if(!duplicateFound) listSkat.add(newSkat);
        }
        return listSkat;
    }


    public void printCards(){
        for(Skat card : cards){
            System.out.println(card);
        }
    }

    public List<Skat> getCards(){
        return cards;
    }
}
