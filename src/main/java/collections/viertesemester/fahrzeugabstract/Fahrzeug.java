package collections.viertesemester.fahrzeugabstract;

public abstract class Fahrzeug {
    protected int geschwindigkeit;

    public abstract void beschleunige(int delta);


    @Override
    public String toString() {
        return "Ich fahre " + geschwindigkeit + " km/h";
    }

}
