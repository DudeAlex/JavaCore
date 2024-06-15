package collections.interfaces.uberschreibbaren;

    public class Consultant extends Angestellter {
        int GEHALTSUNTERGRENZE = 55000;
        int GEHALTSOBERGRENZE = 80000;
        public Consultant(String name, String vorname, int gehalt) {
            super(name, vorname, gehalt);
            setGehalt1(gehalt);
        }

        public void setGehalt1(int gehalt) {
            if (gehalt >= GEHALTSUNTERGRENZE && gehalt <= GEHALTSOBERGRENZE){
                this.gehalt = gehalt;
            } else {
                this.gehalt = 0;
            }
        }
    }
