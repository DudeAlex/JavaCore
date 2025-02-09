package collections.prog2exam.erezept;

import java.util.List;

public abstract class Gericht {

    List<Zutat> zutaten;
    String name;
    int menge;

    public Gericht (List<Zutat> zutaten, String name, int menge) throws FalsheGerichException {
        if(menge <= 0) throw new FalsheGerichException();
        for(Zutat zutat : zutaten) {
            if(zutat.menge <= 0) throw new FalsheGerichException();
        }

        this.zutaten = zutaten;
        this.name = name;
        this.menge = menge;
    }





}
