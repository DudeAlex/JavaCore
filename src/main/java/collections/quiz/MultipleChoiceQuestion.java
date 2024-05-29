package collections.quiz;

public class MultipleChoiceQuestion extends Question {
    private String[] answer;

    @Override
    public void askQuestion() {
        String[] variants = {"A:", "B:", "C:", "D:"};
        System.out.println("Вопрос: " + getQuestion());
        for (int i = 0; i < answer.length; i++) {
            System.out.println(variants[i] + " " + answer[i]);
        }
    }

    public String[] getAnswer() {
        return answer;
    }

    public void setAnswer(String[] answer) {
        this.answer = answer;
    }
}
