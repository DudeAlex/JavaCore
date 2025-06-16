package collections.viertesemester.bufferedostapaufgabezwei;

import java.io.*;
import java.util.Scanner;

public class MitBufferOstap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den Quell-Dateinamen ein: ");

        String quellDatei = scanner.nextLine();

        System.out.print("Geben Sie den Ziel-Dateinamen ein: ");
        String zielDatei = scanner.nextLine();



        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(quellDatei));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(zielDatei))){

            File quellFile = new File(quellDatei);
            File zielFile = new File(zielDatei);
            long start = System.currentTimeMillis();





            byte [] buffer = new byte[4096];
            int b;
            while ((b = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, b);
            }

            long ende = System.currentTimeMillis();


            System.out.println("Datei erfolgreich kopiert.");
            System.out.println("Größe der Quelldatei: " + quellFile.length() + " Bytes");
            System.out.println("Größe der Zieldatei: " + zielFile.length() + " Bytes");
            System.out.println("Kopierdauer: " + (ende - start) + " ms");


        } catch (FileNotFoundException e){
            System.out.println("File ist nicht gefunden");
        } catch (IOException e){
            System.out.println("Fehler beim Lesen/Schreiben des Files");
        }
    }
}
