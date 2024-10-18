package hausaufgabe.lektion15.mitarbeiterbeförder.proffesorundstudent;

public class Professor extends Person{

    public Professor(String fach){
        super(fach);
    }

    @Override
    public String gibTaetigkeitAus(){
        return "Der Professor unterrichtet " + fach;
    }
}
