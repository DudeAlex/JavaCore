package hausaufgabe.lektion17.zeitmessung.ungepufferten;

import java.io.*;

public class GepuffertenStream {
    public static void main(String[] args) {

        long startTime;
        long endTime;
        long duration;

        int i;

        try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream("musikinput.mp3"));
             BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("musikotput.mp3"))) {

            startTime = System.currentTimeMillis();
            do {
                i = bin.read();
                if (i != -1) bout.write(i);
            } while (i != -1);

            endTime = System.currentTimeMillis();
            duration = endTime - startTime;

            System.out.println("Начало времени: " + startTime);
            System.out.println("Конец времени: " + endTime);
            System.out.println("Итоговое время обработки: " + duration + " миллисекунд");
            } catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
