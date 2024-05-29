package collections.quiz;

import java.util.Scanner;

public class QuizMain {
    public static void main(String[] args) {

        QuestionsBank questionsBank = new QuestionsBank();
        Question[] questions = questionsBank.populateQuestions();

        Play play = new Play();
        play.letsplay(questions);
    }
}
