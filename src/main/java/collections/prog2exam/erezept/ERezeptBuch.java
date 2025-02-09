package collections.prog2exam.erezept;

import java.util.ArrayList;
import java.util.List;

public class ERezeptBuch {

    private List<Gericht> listGericht;

    public ERezeptBuch(List<Gericht> listGericht){
        this.listGericht = listGericht;
    }

    public void einfugen(Gericht gericht){
       listGericht.add(gericht);
    }

    public List<Gericht> suche(Zutat zutat){
        List<Gericht> sucheResult = new ArrayList<>();
        for(Gericht gericht : listGericht){
            for(Zutat z : gericht.zutaten){
                if(z.name.equals(zutat.name)) sucheResult.add(gericht);
            }
        }
        return sucheResult;
    }


    public List<Gericht> getListGericht() {
        return listGericht;
    }

    public void setListGericht(List<Gericht> listGericht) {
        this.listGericht = listGericht;
    }
}
