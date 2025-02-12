package collections.prog2exam.erezept;

import java.util.List;

public class OfenUndPfanneGericht extends OfenGericht{

    PfanneGericht pfanneGericht;

    public OfenUndPfanneGericht(PfanneGericht pfanneGericht, List<Zutat> zutaten, String name, int menge, double sandigrad, Ofeneinstellung ofeneinstellung) throws  FalsheGerichException{
        super(zutaten, name, menge, sandigrad, ofeneinstellung);
        this.pfanneGericht = pfanneGericht;
    }

}
