package collections.prog2exam.erezept;

import java.util.List;

public class PfanneGericht extends Gericht{

    public PfanneGericht(List<Zutat> zutaten, String name, int menge) throws FalsheGerichException{
        super(zutaten, name, menge);
    }
}
