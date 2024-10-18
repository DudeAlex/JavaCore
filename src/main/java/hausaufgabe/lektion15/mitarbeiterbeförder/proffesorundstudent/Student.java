package hausaufgabe.lektion15.mitarbeiterbeförder.proffesorundstudent;

public class Student extends Person {

    public Student(String fach){
        super(fach);
    }

    @Override
    public String gibTaetigkeitAus() {
        return "Der Student besucht das Fach " + fach;
    }
}
