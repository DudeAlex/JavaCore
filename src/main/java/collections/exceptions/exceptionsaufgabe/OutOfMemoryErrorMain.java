package collections.exceptions.exceptionsaufgabe;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorMain {
    public static void main(String[] args) {

        try {
            while (true){
                int[] array = new int[1000000000];
            }
        } catch (OutOfMemoryError e){
            System.out.println("Zu groß");
        }
    }
}
