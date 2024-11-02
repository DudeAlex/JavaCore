package hausaufgabe.lektion17.exceptionsaufgabe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionMain {
    public static void main(String[] args) {

        try{
            FileInputStream file = new FileInputStream("qwertyuiop");
        } catch (FileNotFoundException e){
            System.out.println("Es gibt kein File mit dieser Name");
        }
    }
}
