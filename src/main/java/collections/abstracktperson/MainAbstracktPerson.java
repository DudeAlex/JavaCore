package collections.abstracktperson;

public class MainAbstracktPerson {
    public static void main(String[] args) {
        Student stud = new Student("Иван", "Иванов", "программирование");
        //stud.gibTaetigkeitAus();

        Professor prof = new Professor("Александр", "Александрович", "программирование");
        //prof.gibTaetigkeitAus();

        Person[] people = {stud, prof};
        people[0].gibTaetigkeitAus();
        people[1].gibTaetigkeitAus();
    }
}
