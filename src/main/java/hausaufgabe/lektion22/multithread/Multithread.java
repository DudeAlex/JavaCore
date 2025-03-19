package hausaufgabe.lektion22.multithread;

import javax.sound.sampled.Port;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;

public class Multithread {
    public static void main(String[] args) {

        final int PORT = 5001;
        try (ServerSocket serverSocket = new ServerSocket(PORT)){
            while (true){
                System.out.println("Мы внутри цикла while");
                Socket clientSocket = serverSocket.accept();
                System.out.println("ServerSocket выполнен");
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                new Thread(clientHandler).start();
                System.out.println("Стартуем новый поток");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


class ClientHandler implements Runnable {

    private Socket clientSocket;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    @Override
    public void run() {
        try (
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)
        ) {
            String input = in.readLine();
            System.out.println("Получено от клиента: " + input);

            // Разбираем строку в список чисел
            List<Integer> numbers = parseNumbers(input);
            List<Integer> primes = findPrimes(numbers);

            // Отправляем результат обратно клиенту
            out.println("Простые числа: " + primes);
            System.out.println("Отправлен ответ: " + primes);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                clientSocket.close(); // Закрываем соединение после обработки клиента
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private List<Integer> parseNumbers(String input) {
        List<Integer> numbers = new ArrayList<>();
        String[] parts = input.split(",");
        for (String part : parts) {
            try {
                numbers.add(Integer.parseInt(part.trim()));
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод: " + part);
            }
        }
        return numbers;
    }

    private List<Integer> findPrimes(List<Integer> numbers) {
        List<Integer> primes = new ArrayList<>();
        for (int num : numbers) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        return primes;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }






}