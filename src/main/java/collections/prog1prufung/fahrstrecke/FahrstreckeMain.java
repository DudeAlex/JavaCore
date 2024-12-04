package collections.prog1prufung.fahrstrecke;

public class FahrstreckeMain {
    public static void main(String[] args) {

        Zielort wurzburg = new Zielort("Wurzburg", 0);



        Zielort kitzingen = new Zielort("Kitzingen", 19);
        Zielort neustadt = new Zielort("Neustadt", 42);
        Zielort nurnberg = new Zielort("Nürnberg", 49);


        Route route = new Route();
        route.add(wurzburg);
        route.add(kitzingen);
        route.add(neustadt);
        route.add(nurnberg);


        System.out.println(route.gesamtStrecke());
    }
}
