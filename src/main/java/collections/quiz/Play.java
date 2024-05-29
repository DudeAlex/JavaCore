package collections.quiz;

import java.util.Scanner;

public class Play {

    public void letsplay(Question[] questions){
        for (int i = 0; i < questions.length; i++) {
            questions[i].askQuestion();
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();
            if(userAnswer.equals(questions[i].getKorrektAnswer())) {
                System.out.println("Верно!");
            } else System.out.println("Не верно!");
        }
    }
}
