package collections.abstracktperson;

public class Professor extends Person{
    public Professor(String firstName, String lastName, String subject) {

        super(firstName, lastName, subject);
    }

    @Override
    public void gibTaetigkeitAus() {
        System.out.println("Привет, я профессор, я преподаю программирование. Меня зовут: " + getFirstName() + " " + getLastName());
    }
}
