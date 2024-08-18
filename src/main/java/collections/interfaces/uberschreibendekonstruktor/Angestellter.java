package collections.interfaces.uberschreibendekonstruktor;

public class Angestellter {
        String name;
        String vorname;
        int gehalt;
        public Angestellter(String name, String vorname, int gehalt) {
            this.name = name;
            this.vorname = vorname;
            setGehalt(gehalt);
        }

        public Angestellter(String name, String vorname){
            this.name = name;
            this.vorname = vorname;
            this.gehalt = -1;
        }
        public final void setGehalt(int gehalt) {
            if(gehalt > 0)
                this.gehalt = gehalt;
        }

    public int getGehalt() {
        return gehalt;
    }
}
