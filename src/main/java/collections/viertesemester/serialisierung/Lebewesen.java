package collections.viertesemester.serialisierung;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Lebewesen implements Serializable {

    String name;

    public Lebewesen(String name){
        this.name = name;
    }

    public abstract void beschreibe();

}
