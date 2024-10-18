package hausaufgabe.lektion15.mitarbeiterbeförder.proffesorundstudent;

public class ProfessorUndStudent {
    public static void main(String[] args) {


        Person[] people = new Person[10];
        for(int i = 0; i < people.length; i++){
            if (i % 2 == 0) people[i] = new Student("Programmieren");
             else people[i] = new Professor("Programmieren");
        }

        for(Person person: people){
            System.out.println(person.gibTaetigkeitAus());
        }
    }
}
