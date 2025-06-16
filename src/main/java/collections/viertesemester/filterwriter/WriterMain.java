package collections.viertesemester.filterwriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriterMain {

    public static void main(String[] args) {

        try (java.io.Writer fw = new FileWriter("ausgabe.txt");
             DoubleVowelWriter dw = new DoubleVowelWriter(fw)) {

            dw.write("Haus und Auto fahren");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
