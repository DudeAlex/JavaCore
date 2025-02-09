package prufung.rauminvasoren;

import java.util.Scanner;

public class RauminvasorenMain {
    public static void main(String[] args) {

        Rauminvasoren rauminvasoren = new Rauminvasoren();
        System.out.println(rauminvasoren);

        System.out.println("Введите букву: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        while(!input.equals("x")){
            rauminvasoren.move(input.charAt(0));
            System.out.println(rauminvasoren);
            System.out.println("Введите букву: ");
            input = scanner.next();
        }
        System.out.println("игра окончена");
        scanner.close();
    }
}
