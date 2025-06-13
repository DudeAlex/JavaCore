package collections.viertesemester.fahrzeugeostap;

public class FahrzeugeOstapMain {
    public static void main(String[] args) {

        Fahrzeug[] fahrzeugs = new Fahrzeug[]{
                new Auto(),
                new Fahrrad(),
                new Elektroauto()
        };

        fahrzeugeTesten(fahrzeugs);
    }

    public static void fahrzeugeTesten(Fahrzeug[] fs){
        for(Fahrzeug fahreugss : fs){
            fahreugss.fahre();
            System.out.println(fahreugss.tankstand());

        }
    }
}
