package collections.prog2exam.erezept;

import java.util.ArrayList;
import java.util.List;

import static collections.prog2exam.erezept.Ofeneinstellung.OBENWÄRME;
import static collections.prog2exam.erezept.Typ.GRAMM;
import static collections.prog2exam.erezept.Typ.LITER;

public class ERezeptMain {
    public static void main(String[] args) throws FalsheGerichException {

        Zutat zutat1 = new Zutat("Kartofel", 300.0, GRAMM);
        Zutat zutat2 = new Zutat("ris", 200.0, GRAMM);
        Zutat zutat3 = new Zutat("myaso", 500.0, GRAMM);
        Zutat zutat4 = new Zutat("luk", 1.0, LITER);

        List<Zutat> zutatList1 = new ArrayList<>();
        zutatList1.add(zutat2);
        zutatList1.add(zutat3);

        List<Zutat> zutatList2 = new ArrayList<>();
        zutatList1.add(zutat1);
        zutatList1.add(zutat4);



        Gericht pfaneGericht = new PfanneGericht(zutatList1, "plov", 500);
        Gericht ofenGericht = new OfenGericht(zutatList2, "jarenniy kartofel", 400, 150.0, OBENWÄRME);

        List<Gericht> listGericht = new ArrayList<>();

        ERezeptBuch eRezeptBuch = new ERezeptBuch(listGericht);

        eRezeptBuch.einfugen(pfaneGericht);
        eRezeptBuch.einfugen(ofenGericht);


    }
}
