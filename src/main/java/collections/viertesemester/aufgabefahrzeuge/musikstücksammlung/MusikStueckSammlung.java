package collections.viertesemester.aufgabefahrzeuge.musikstücksammlung;

import java.util.*;

public class MusikStueckSammlung {

    Map<String, MusikStueck> map = new HashMap<>();

    public void musikStueckEinfügen(MusikStueck neu){

        if(map.containsKey(neu.titel)){
            throw new IllegalArgumentException("Lied ist schon da");
        }

        map.put(neu.titel, neu);
    }

    public MusikStueck[] getAlleMusikStueckeNachTitel(){

        Collection<MusikStueck> werte = map.values();


        List<MusikStueck> musikStueckList = new ArrayList<>(werte);


        Collections.sort(musikStueckList, new VergleicheMusikStueckTitel());

        return musikStueckList.toArray(new MusikStueck[0]);
    }


}
