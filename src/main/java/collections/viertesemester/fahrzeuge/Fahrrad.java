package collections.viertesemester.fahrzeuge;

public class Fahrrad extends Fahrzeug{

    public Fahrrad(){
        super();
    }

    @Override
    public double rechneFahrt(Fahrt fahrt){
        return 0.125 * fahrt.min;
    }

    @Override
    public String schreibeFahrt(){
        return "Fahrt wurde geschrieben";
    }


}
