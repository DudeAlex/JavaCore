package collections.quiz;

public abstract class Question {
    private String question;
    private String korrektAnswer;


    public abstract void askQuestion();



    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getKorrektAnswer() {
        return korrektAnswer;
    }

    public void setKorrektAnswer(String korrektAnswer) {
        this.korrektAnswer = korrektAnswer;
    }
}
