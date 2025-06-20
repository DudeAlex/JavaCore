package collections.viertesemester.fahrzeuge;

import java.util.List;

public class Umsatzberechner {

    public double berechneUmsatz(List<Fahrzeug> fahrzeugList){
        double sum = 0;

        for(Fahrzeug fz : fahrzeugList){
            for(Fahrt f : fz.fahrtList){
                sum += fz.berechnen(f);
            }
        }
        return sum;
    }

    public double berechneElektroumsatz(List<Fahrzeug> fahrzeugList){
        double sum = 0;

        for(Fahrzeug fz : fahrzeugList){
            if(fz instanceof ElektroVariant){
                for(Fahrt f : fz.fahrtList){
                    sum += fz.berechnen(f);
                }
            }
        }
        return sum;
    }
}
