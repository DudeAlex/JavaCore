package collections.prog1prufung.fahrstrecke;

public class Zielort {

    private String name;
    private int distanz;
    Zielort next;

    public Zielort(String name, int distanz){
        this.name = name;
        this.distanz = distanz;
    }


    @Override
    public String toString(){
        //Ortsname: Kitzingen Distanz: 19 km
        return "Ortsname: " + getName() + " Distanz: " + getDistanz() + " km";

    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getDistanz(){
        return distanz;
    }

    public void setDistanz(int distanz){
        this.distanz = distanz;
    }



}
