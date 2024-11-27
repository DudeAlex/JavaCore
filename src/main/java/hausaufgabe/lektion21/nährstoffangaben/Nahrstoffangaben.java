package hausaufgabe.lektion21.nährstoffangaben;

public class Nahrstoffangaben {

    double grosse;
    int anzahl;


    // ниже необязательные поля
    double eiweiß;
    double fett;
    double kohlenhydrate;
    double natrium;

    private Nahrstoffangaben(double grosse, int anzahl, double eiweiß, double fett, double kohlenhydrate, double natrium){
        this.grosse = grosse;
        this.anzahl = anzahl;
        this.eiweiß = eiweiß;
        this.fett = fett;
        this.kohlenhydrate = kohlenhydrate;
        this.natrium = natrium;
    }


    @Override
    public String toString() {
        return "Nahrstoffangaben{" +
                "grosse=" + grosse +
                ", anzahl=" + anzahl +
                ", eiweiß=" + eiweiß +
                ", fett=" + fett +
                ", kohlenhydrate=" + kohlenhydrate +
                ", natrium=" + natrium +
                '}';
    }

    public static class NarhrstoffangabenBuilder {

        double grosse;
        int anzahl;


        // ниже необязательные поля
        double eiweiß;
        double fett;
        double kohlenhydrate;
        double natrium;


        public NarhrstoffangabenBuilder(double grosse, int anzahl){
            this.grosse = grosse;
            this.anzahl = anzahl;
        }

        public NarhrstoffangabenBuilder withEiweiß(double eiweiß){
            this.eiweiß = eiweiß;
            return this;
        }

        public NarhrstoffangabenBuilder withFett(double fett){
            this.fett = fett;
            return this;
        }

        public NarhrstoffangabenBuilder withKohlenhydrate(double kohlenhydrate){
            this.kohlenhydrate = kohlenhydrate;
            return this;
        }

        public NarhrstoffangabenBuilder withNatrium(double natrium){
            this.natrium = natrium;
            return this;
        }


        public Nahrstoffangaben build(){
            return new Nahrstoffangaben(grosse, anzahl, eiweiß, fett, kohlenhydrate, natrium);
        }

    }

}
