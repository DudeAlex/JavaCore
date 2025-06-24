package collections.viertesemester.generischecontainer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box <T extends Comparable<T>>{

    List<T> elemente = new ArrayList<>();

    public void add(T obj){
        elemente.add(obj);
    }


    public T max(){
        return Collections.max(elemente);
    }

    public static void main(String[] args) {


        Box<Integer> integer = new Box<>();

        integer.add(45);
        integer.add(8);
        System.out.println(integer.max());

        Box<String> string = new Box<>();
        string.add("zalloerqwrewe");
        string.add("torldere");

        System.out.println(string.max());
    }




}
