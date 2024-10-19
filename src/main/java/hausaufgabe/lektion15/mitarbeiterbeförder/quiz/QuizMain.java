package hausaufgabe.lektion15.mitarbeiterbeförder.quiz;

import collections.quiz.Play;
import collections.quiz.Question;
import collections.quiz.QuestionsBank;

public class QuizMain {
    public static void main(String[] args) {
        FragenBank fragenBank = new FragenBank();
        Frage[] frages = fragenBank.populateQuestions();

        Spiel spiel = new Spiel();
        spiel.lassunsspielen(frages);

    }
}
