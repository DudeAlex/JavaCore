package collections.viertesemester.serialisierung;

import java.io.*;
import java.util.ArrayList;

public class LebewesenMain {
    public static void main(String[] args) {


        ArrayList<Lebewesen> arrayList = new ArrayList<>();
        arrayList.add(new Mensch("Ivan", "Lehrer"));
        arrayList.add(new Mensch("Petya", "Fahrer"));
        arrayList.add(new Tier("Elefhant", "Wild"));
        arrayList.add(new Tier("Snake", "Wild"));



        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("lebewesen.dat"))) {
            oos.writeObject(arrayList);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lebewesen.dat"))){

            ArrayList<Lebewesen> lebewesenArrayList =  (ArrayList<Lebewesen>) ois.readObject();
            for(Lebewesen l : lebewesenArrayList){
                l.beschreibe();
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
