package collections.quiz;

public class QuestionsBank {
    Question[] questions;

    public Question[] populateQuestions(){
        TextQuestion question1 = new TextQuestion();
        question1.setQuestion("What is a capital of Germany?");
        question1.setKorrektAnswer("Berlin");

        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion();
        question2.setQuestion("What is a capital of Uzbekistan?");
        question2.setAnswer(new String[]{"Tashkent", "Bukhara", "Samarkand", "Khiva"});
        question2.setKorrektAnswer("Tashkent");

        Question[] questionsqq = {question1, question2};

        return questionsqq;
    }

}
