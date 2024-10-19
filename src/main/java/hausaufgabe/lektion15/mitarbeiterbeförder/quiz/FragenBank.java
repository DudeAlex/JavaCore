package hausaufgabe.lektion15.mitarbeiterbeförder.quiz;

import collections.quiz.MultipleChoiceQuestion;
import collections.quiz.Question;
import collections.quiz.TextQuestion;

public class FragenBank {

    Frage[] fragen;

    public Frage[] populateQuestions(){
        TextFrage frage1 = new TextFrage();
        frage1.setFrage("What is a capital of Germany?");
        frage1.setAntwort("Berlin");

        MultipleChoiceFrage frage2 = new MultipleChoiceFrage();
        frage2.setFrage("What is a capital of Uzbekistan?");
        frage2.setAntwort(new String[]{"Tashkent", "Bukhara", "Samarkand", "Khiva"});
        frage2.setAntwort("Tashkent");

        Frage[] frages = {frage1, frage2};

        return frages;
    }
}
