package hausaufgabe.lektion17.zeitmessung;

import java.io.*;

public class ByteUngepuffertenStream {
    public static void main(String[] args) {

        byte[] buffer = new byte[120];
        int bytesRead;

        long startTime;
        long endTime;
        long duration;

        int i;

        try (FileInputStream fin = new FileInputStream("musikinput.mp3");
             FileOutputStream fout = new FileOutputStream("musikotput.mp3")) {

            startTime = System.currentTimeMillis();
            while((bytesRead = fin.read(buffer)) != -1) {
                fout.write(buffer, 0, bytesRead);
            }

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
