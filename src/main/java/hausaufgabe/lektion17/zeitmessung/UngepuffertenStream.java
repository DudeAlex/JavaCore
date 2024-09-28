package hausaufgabe.lektion17.zeitmessung;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UngepuffertenStream {
    public static void main(String[] args) {

        long startTime;
        long endTime;
        long duration;

        int i;

        try (FileInputStream fin = new FileInputStream("musikinput.mp3");
             FileOutputStream fout = new FileOutputStream("musikotput.mp3")) {
            startTime = System.currentTimeMillis();
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
            endTime = System.currentTimeMillis();
            duration = endTime - startTime;
            System.out.println("начало времени: " + startTime);
            System.out.println("конец времени: " + endTime);
            System.out.println("Итоговое время обработки: " + duration);
        } catch (
                IOException e) {
            System.out.println("Ощибка ввода-вывода: " + e);
        }
    }
}
