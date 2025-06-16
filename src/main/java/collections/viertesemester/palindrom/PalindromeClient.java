package collections.viertesemester.palindrom;


import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class PalindromeClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            BufferedReader serverReader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            BufferedWriter serverWriter = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream()));
            Scanner inputScanner = new Scanner(System.in);

            System.out.println("Geben Sie Text ein (oder 'exit' zum Beenden):");

            while (true) {
                String input = inputScanner.nextLine();
                if ("exit".equalsIgnoreCase(input)) break;

                serverWriter.write(input);
                serverWriter.newLine();
                serverWriter.flush();

                String response = serverReader.readLine();
                System.out.println("Server: " + response);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
