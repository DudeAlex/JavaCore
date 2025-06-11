package collections.viertesemester.aufgabefahrzeuge;

public class Motorroller extends Fahrzeug {


    public Motorroller(){
        super();
    }

    @Override
    public double rechneFahrt(Fahrt fahrt){
        return 3 + 0.15 * fahrt.km;
    }

    @Override
    public String schreibeFahrt(){
        return "Fahrt wurde geschrieben";
    }
}
