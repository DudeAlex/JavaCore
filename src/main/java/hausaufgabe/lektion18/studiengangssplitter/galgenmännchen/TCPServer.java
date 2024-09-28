package hausaufgabe.lektion18.studiengangssplitter.galgenmännchen;

import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        final int PORT = 5000;
        String word = "programmieren";  // Слово, которое нужно угадать
        char[] guessedWord = new char[word.length()];

        // Заполняем массив символов подчеркиваниями для отображения угаданных букв
        for (int i = 0; i < word.length(); i++) {
            guessedWord[i] = '_';
        }

        try (ServerSocket ss = new ServerSocket(PORT)) {
            System.out.println("Сервер запущен. Ожидание подключения клиента...");
            Socket connection = ss.accept();
            System.out.println("Клиент подключен!");

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(connection.getOutputStream()), true);

            int attempts = 6; // Количество попыток

            // Отправляем начальное состояние слова
            while (attempts > 0) {
                out.println("Слово: " + String.valueOf(guessedWord)); // Отправляем текущее состояние слова
                out.println("Осталось попыток: " + attempts);
                out.println("Введите букву:");

                String clientGuess = br.readLine(); // Получаем букву от клиента

                // Проверяем ввод
                if (clientGuess == null || clientGuess.length() != 1) {
                    out.println("Ошибка ввода. Введите одну букву.");
                    continue;
                }

                char guessedChar = clientGuess.charAt(0);
                boolean correctGuess = false;

                // Проверяем, есть ли введенная буква в слове
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guessedChar) {
                        guessedWord[i] = guessedChar;
                        correctGuess = true;
                    }
                }

                if (!correctGuess) {
                    attempts--;
                    out.println("Неправильная буква!");
                } else {
                    out.println("Правильная буква!");
                }

                // Проверяем, угадал ли клиент слово
                if (String.valueOf(guessedWord).equals(word)) {
                    out.println("Поздравляем! Вы угадали слово: " + word);
                    break;
                }

                // Отправляем ответ клиенту
                out.flush(); // Принудительно отправляем данные клиенту
            }

            if (attempts == 0) {
                out.println("Вы проиграли. Загаданное слово было: " + word);
            }

            out.println("Игра окончена.");
            connection.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
