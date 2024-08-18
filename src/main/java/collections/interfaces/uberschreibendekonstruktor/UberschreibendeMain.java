package collections.interfaces.uberschreibendekonstruktor;

public class UberschreibendeMain {
    public static void main(String[] args) {

        Consultant consultant = new Consultant("Ivan", "Ivanov", 1000);
        System.out.println(consultant.getGehalt());
        Angestellter angestellter = new Angestellter("Ivab", "Ivabov", 2000);
        System.out.println(angestellter.getGehalt());
        Angestellter angestellter2 = new Angestellter("Ivabbb", "Ivabovvv");
        System.out.println(angestellter2.getGehalt());
        Angestellter angestellter3 = new Angestellter("Ivab_", "Ivabov_", -2000);
        System.out.println(angestellter3.getGehalt());





    }
}
