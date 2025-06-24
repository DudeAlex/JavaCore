package collections.viertesemester.pizzabuilder;

public class Pizza {

    private String groesse;
    private boolean kaese, schinken, pilze, salami;

    private Pizza(String groesse, boolean kaese, boolean schinken, boolean pilze, boolean salami){
        this.groesse = groesse;
        this.kaese = kaese;
        this.schinken = schinken;
        this.pilze = pilze;
        this.salami = salami;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "groesse='" + groesse + '\'' +
                ", kaese=" + kaese +
                ", schinken=" + schinken +
                ", pilze=" + pilze +
                ", salami=" + salami +
                '}';
    }




    public static class PizzaBuilder {

        private String groesse;
        private boolean kaese, schinken, pilze, salami;

        public PizzaBuilder(String groesse) {
            this.groesse = groesse;
        }

        public PizzaBuilder withKaese(boolean kaese) {
            this.kaese = kaese;
            return this;
        }

        public PizzaBuilder withSchinken(boolean schinken) {
            this.schinken = schinken;
            return this;
        }

        public PizzaBuilder withPilze(boolean pilze) {
            this.pilze = pilze;
            return this;
        }

        public PizzaBuilder withSalami(boolean salami) {
            this.salami = salami;
            return this;
        }

        public Pizza build() {
            return new Pizza(groesse, kaese, schinken, pilze, salami);
        }
    }



}
