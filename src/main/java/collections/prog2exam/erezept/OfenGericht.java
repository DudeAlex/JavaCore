package collections.prog2exam.erezept;

import java.util.List;

public class OfenGericht extends Gericht{

    double sandigrad;
    Ofeneinstellung ofeneinstellung;

    public OfenGericht(List<Zutat> zutaten, String name, int menge, double sandigrad, Ofeneinstellung ofeneinstellung) throws FalsheGerichException{
        super(zutaten, name, menge);
        this.sandigrad = sandigrad;
        this.ofeneinstellung = ofeneinstellung;
    }

}
