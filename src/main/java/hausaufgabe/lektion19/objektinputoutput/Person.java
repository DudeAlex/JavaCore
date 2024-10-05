package hausaufgabe.lektion19.objektinputoutput;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    String vorname;
    transient String passwort;
    public Person(String name, String vorname, String passwort)
    {
        this.name = name;
        this.vorname = vorname;
        this.passwort = passwort;
    }
}
