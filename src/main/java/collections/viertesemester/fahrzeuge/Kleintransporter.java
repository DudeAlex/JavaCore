package collections.viertesemester.fahrzeuge;


/*
In Zukunft sollen noch Kleintransporter und weitere Fahrzeuge im Fuhrpark ergänzt werden, die
eine eigene Berechnungsformel mitbringen können. Erweitern Sie Ihre Software, so dass
Kleintransporter bereits jetzt unterstützt werden.
Entgelt für Kleintransporter bei einer Nutzung von
• einer Stunde oder kürzer: 30ct/km
• länger als 1 Stunde: 25ct/min für jede Minute nach der ersten Stunde + 30ct/km
 */
public class Kleintransporter extends Fahrzeug{

    public Kleintransporter(){
        super();
    }


    @Override
    public double rechneFahrt(Fahrt fahrt){
        if(fahrt.min <= 60) return 0.30 * fahrt.km;
        else {
            int zusatzMinuten = fahrt.min - 60;
            return (0.30 * fahrt.km) + (0.25 * zusatzMinuten);
        }
    }

    @Override
    public String schreibeFahrt(){
        return "Fahrt wurde geschrieben";
    }
}
