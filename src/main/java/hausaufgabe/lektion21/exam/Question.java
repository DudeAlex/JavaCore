package hausaufgabe.lektion21.exam;

public class Question {

    String text;

    private Question(String line) {
        this.text = line;
    }


    public static Question toQuestion(String line) {
        return new Question(line);
    }


}
