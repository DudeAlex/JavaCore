package collections.viertesemester.serialisierung;

import java.io.Serializable;

public class Mensch extends Lebewesen implements Serializable {

    String beruf;

    public Mensch(String name, String beruf){
        super(name);
        this.beruf = beruf;

    }

    @Override
    public void beschreibe(){
        System.out.println("Ich bin ein Mensch " + name + " beruflich " + beruf);
    }
}
