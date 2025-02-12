package hausaufgabe.lektion21.exam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exam {

    List<Question> questionList = new ArrayList<>();
    String readHeaderFromFile() {
        return null;
    }

    public void readQuestions(String fileName){
        try (BufferedReader br = new BufferedReader(new FileReader(fileName));){
            do{
                String line = br.readLine();
                if(line == null) break;
                //System.out.println(line);
                questionList.add(Question.toQuestion(line));
            } while (true);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void toTest(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/resources/test.tex"));){

            for(Question question : questionList) {
                bw.write( "\\textbf{ " + question.text + "} \\\\");
                bw.newLine();
            }

            bw.write("\\end{document}");

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.readQuestions("src/main/resources/questions.csv");

        exam.toTest();

    }
}
