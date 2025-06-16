package collections.viertesemester.palindrom;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Palindrom {
    public static void main(String[] args) throws IOException {


        try(ServerSocket  serverSocket  = new ServerSocket(5000);
            Socket client = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()))){

            String line;

            while((line = br.readLine()) != null){
                String response = isPalindrome(line) ? "Palindrome!" : "Nicht Palindrom";
                bw.write(response);
                bw.newLine();
                bw.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static boolean isPalindrome(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
