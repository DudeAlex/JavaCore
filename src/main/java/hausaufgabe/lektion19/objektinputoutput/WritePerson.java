package hausaufgabe.lektion19.objektinputoutput;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class WritePerson {
    public static void main(String[] args) {
        try{
            Person person = new Person("John", "Doe", "qwertyuiop");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"));
            oos.writeObject(person);
            oos.close();
        } catch (Exception e){
            System.out.println("Ошибка в записи файла" + e.getMessage());
        }
    }
}
