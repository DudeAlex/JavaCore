package hausaufgabe.lektion17.exceptions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Wertebereiche {
    public static void writeToFile(String data, int offset, int length) {
        //String str = "Пример записи данных с использованием OutputStream и write с параметрами offset и length.";
        //System.out.println("длина data равна: " + data.length());
        int dataLength = data.length();
        if(offset < 0) throw new IllegalArgumentException("Ты ввел отрицательный offset, ну вот посмотри сам " + offset);
        if(length < 0) throw new IllegalArgumentException("Ты ввел отрцательный length, посмотри сам " + length);


        // Преобразуем строку в массив байтов
        byte[] byteArray = data.getBytes();
        try {
            // Создаем объект OutputStream, указывая путь к файлу для записи
            OutputStream outputStream = new FileOutputStream("output.txt");

            // Записываем часть массива байтов в файл с использованием оффсета и длины
            outputStream.write(byteArray, offset, length);

            // Закрываем поток
            outputStream.close();

            System.out.println("Данные успешно записаны в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
