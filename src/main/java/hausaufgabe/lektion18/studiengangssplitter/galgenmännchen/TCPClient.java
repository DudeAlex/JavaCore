package hausaufgabe.lektion18.studiengangssplitter.galgenmännchen;

import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        final int PORT = 5000;
        final String HOST = "localhost";

        try (Socket socket = new Socket(HOST, PORT);
             BufferedReader inFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter outToServer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

            String serverResponse;

            // Чтение сообщений от сервера и отправка ответов
            while ((serverResponse = inFromServer.readLine()) != null) {
                System.out.println(serverResponse); // Выводим ответ от сервера

                if (serverResponse.contains("Введите букву:")) {
                    String userGuess = userInput.readLine(); // Ввод пользователя
                    outToServer.println(userGuess); // Отправляем серверу
                    outToServer.flush(); // Принудительно отправляем данные
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
