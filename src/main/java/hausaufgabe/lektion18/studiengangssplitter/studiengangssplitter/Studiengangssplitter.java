package hausaufgabe.lektion18.studiengangssplitter.studiengangssplitter;

import java.io.*;

public class Studiengangssplitter {
  // нужно файлы вставить
    /*public static void splitStudiengang(String dateiname) throws MatrikelnummerException{
        try(BufferedReader br = new BufferedReader(new FileReader(dateiname)));
        BufferedWriter bwInf = new BufferedWriter(new FileWriter("InfNr.txt"));
        BufferedWriter bwWInf = new BufferedWriter(new FileWriter("WinfNr.txt"));
        BufferedWriter bwEc = new BufferedWriter(new FileWriter("ECNr.txt"))){
    do{

        String line = br.readLine();
        if(line.length() != 7){
            throw new MatrikelnummerException("stimmt nicht");
        }
        if (line == null) break;
        String identifier = line.substring(0,2);
        try{
            if(identifier.equals("51")){
                bwInf.write(line);
                bwInf.newLine();
            } else if(identifier.equals("50")){
                bwWInf.write(line);
                bwWInf.newLine();
            } else if(identifier.equals("61")){
                bwEc.write(line);
                bwEc.newLine();
            } else {
                throw new MatrikelnummerException("Could not identify");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    } while (true);
        }
    }*/

}
