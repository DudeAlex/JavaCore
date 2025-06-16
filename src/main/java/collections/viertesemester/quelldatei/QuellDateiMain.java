package collections.viertesemester.quelldatei;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class QuellDateiMain {
    public static void main(String[] args) throws IOException {


        try(FileInputStream fis = new FileInputStream("quelle.dat");
            FileOutputStream fos = new FileOutputStream("ziel.dat")){

            int b;

            while((b = fis.read()) != -1){
                fos.write(b);
            }


        } catch (FileNotFoundException e){
            System.out.println("Nicht gefunden");
        }

    }
}
