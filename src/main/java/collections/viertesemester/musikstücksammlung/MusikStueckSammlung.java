package collections.viertesemester.musikstücksammlung;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MusikStueckSammlung {

    HashMap<String, MusikStueck> sammlung;

    public MusikStueckSammlung(){
        sammlung = new HashMap<>();
    }

    public void musikStueckEinfügen(MusikStueck neu){

        if(sammlung.containsKey(neu.titel)) throw new IllegalArgumentException("Bereits exestiert");

        sammlung.put(neu.titel, neu);
    }

    public List<MusikStueck> getAlleMusikStueckeNachTitel(){

        List<MusikStueck> alleMusikStueckeNachTitel = new ArrayList<>(sammlung.values());

        alleMusikStueckeNachTitel.sort(new VergleicheMusikStueckTitel());

        return alleMusikStueckeNachTitel;
    }

    public List<MusikStueck> getAlleMusikStueckeNachLaenge(){

        List<MusikStueck> alleMusikStueckeNachLaenge = new ArrayList<>(sammlung.values());

        alleMusikStueckeNachLaenge.sort(new VergleicheMusikStueckLaenge());
        return alleMusikStueckeNachLaenge;
    }
}
