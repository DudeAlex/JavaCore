package hausaufgabe.lektion22.multithread;
import java.io.*;
import java.net.*;
public class TCPClient {
        public static void main(String[] args) {
            String host = "localhost"; // IP-адрес сервера
            int port = 5001; // Порт сервера

            try (Socket socket = new Socket(host, port);
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                 BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

                // Отправляем список чисел серверу
                String numbers = "10, 15, 23, 7, 19, 33, 5";
                System.out.println("Отправляем серверу: " + numbers);
                out.println(numbers);

                // Получаем ответ от сервера
                String response = in.readLine();
                System.out.println("Ответ от сервера: " + response);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}

