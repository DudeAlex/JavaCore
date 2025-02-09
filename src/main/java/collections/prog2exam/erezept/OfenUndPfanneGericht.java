package collections.prog2exam.erezept;

import java.util.List;

public class OfenUndPfanneGericht extends OfenGericht{

    PfanneGericht pfanneGericht;

    public OfenUndPfanneGericht(PfanneGericht pfanneGericht, List<Zutat> zutaten, String name, int menge, double sandigrad, OfenGericht ofenGericht) throws  FalsheGerichException{
        super(zutaten, name, menge, sandigrad, ofenGericht);
        this.pfanneGericht = pfanneGericht;
    }

}
