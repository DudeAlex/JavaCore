package collections.viertesemester.serialisierung;

import java.io.Serializable;

public class Tier extends Lebewesen implements Serializable {

    String art;

    public Tier(String name, String art){
        super(name);
        this.art = art;
    }

    @Override
    public void beschreibe(){
        System.out.println("Ich bin ein Tier " + name + " art ist: " + art);
    }
}
