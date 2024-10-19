package collections.hashmap;

import java.util.*;

public class Vokabeltrainer {
    Map<String, String> english2German = new HashMap<>();
    String wordToGuess;

    public void addToDictionary(String englishWord, String germanWord) {
        english2German.put(englishWord, germanWord);
    }

    public void createRandomWordToGuess() {
        Set<String> keySet = english2German.keySet();
        int randomIndex = (int) (Math.random() * keySet.size());
        Iterator<String> iterator = keySet.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (i == randomIndex) {
                wordToGuess = word;
                return;
            }
            i++;
        }
    }

    //todo createRandomWordToGuess2 (foreach)

    public String getWordToGuess() {
        return wordToGuess;
    }
    public boolean guess(String guess) {
        String solution = english2German.get(wordToGuess);
        if (guess.equals(solution))
            return true;
        return false;
    }


    public static void main(String[] args) {
        Vokabeltrainer guessingGame = new Vokabeltrainer();
        guessingGame.addToDictionary("to clean", "reinigen");
        guessingGame.addToDictionary("to drink", "trinken");
        guessingGame.addToDictionary("to eat", "essen");
        guessingGame.addToDictionary("to see", "sehen");

        guessingGame.createRandomWordToGuess();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Was heißt \"" + guessingGame.getWordToGuess() + "\" auf Deutsch?");
        String guess = scanner.nextLine();
        boolean correct = guessingGame.guess(guess);
        if (correct) System.out.println("Korrekt!");
        else System.out.println("Leider falsch!");
        scanner.close();
    }
}
