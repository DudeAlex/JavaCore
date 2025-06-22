package collections.finder;

import java.io.*;
import java.util.Scanner;

public class Finder {


    public BufferedReader getSystemInAsBufferedReader() {

        System.out.print("Введите строку: ");

        return new BufferedReader(new InputStreamReader(System.in));

    }

    public void findStringInFiles(String searchString, String[] filenames) throws FileNotFoundException {

        for(int i = 0; i < filenames.length; i++){


            try(BufferedReader bf = new BufferedReader(new FileReader("src/main/resources/" + filenames[i]))){

                String line;
                int lineNumber = 1;

                while((line = bf.readLine()) != null){
                    if(line.contains(searchString)) {
                        System.out.println(filenames[i] + " " + lineNumber);
                    }

                    lineNumber++;

                }

            } catch (IOException e){
                System.out.println("Error");
            }

        }



    }

    public static void main(String[] args)
    {
        Finder finder = new Finder();
        BufferedReader br = finder.getSystemInAsBufferedReader();
        String searchString = null;
        try {
            searchString = br.readLine();
            finder.findStringInFiles(searchString, args);
            br.close();
        } catch (IOException ex) {
            System.out.println("Ошибка чтения ввода.");
        }
    }
}
