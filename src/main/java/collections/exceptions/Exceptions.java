package collections.exceptions;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        System.out.println("Output is: " + readNumber());
    }

    public static int readNumber() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String eingabe = scanner.nextLine();
        int zahl = Integer.valueOf(eingabe);
        return zahl;
    }
}
