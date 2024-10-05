package hausaufgabe.lektion19.objektinputoutput;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadPerson {
    public static void main(String[] args) {
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"));
            Person person = (Person) ois.readObject();
            ois.close();
            System.out.println(person.name + " " + person.vorname + " " + person.passwort);
        } catch (Exception e){
           e.printStackTrace();
        }
    }
}
