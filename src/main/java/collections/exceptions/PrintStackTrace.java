package collections.exceptions;

import java.io.IOException;
import java.util.Scanner;

public class PrintStackTrace {
    public static void main(String[] args) {
        /*Scanner s = new Scanner(System.in);
        s.nextLine();
        s.close();*/
        try {
            char c = (char) System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
