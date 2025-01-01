package collections.prog1prufung.fahrstrecke.spaceinvaders;

import java.util.Scanner;

public class SpaceInvadersMain {
    public static void main(String[] args) {

        SpaceInvaders spaceInvaders = new SpaceInvaders();
        System.out.println(spaceInvaders);


        System.out.println("Введите букву: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        while(!input.equals("x")){
            spaceInvaders.bewege(input.charAt(0));
            System.out.println(spaceInvaders);
            System.out.println("Введите букву: ");
            input = scanner.next();
        }
        System.out.println("Игра окончена");
        scanner.close();
    }
}
