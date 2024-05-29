package collections.quiz;

public class TextQuestion extends Question{


    @Override
    public void askQuestion() {
        System.out.println("Вопрос: " + getQuestion());
    }
}
