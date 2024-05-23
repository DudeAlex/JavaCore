package collections.abstracktperson;

public class Student extends Person {

    public Student(String firstName, String lastName, String subject) {
        super(firstName, lastName, subject);
    }

    @Override
    public void gibTaetigkeitAus() {
        System.out.println("Привет, я студент, я посещаю программирование. Меня зовут: " + getFirstName() + " " + getLastName());
    }
}
