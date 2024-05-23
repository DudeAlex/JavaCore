/*
Абстрактный класс "Person" с абстрактным методом "выводитьДеятельность", который должен использоваться для вывода
деятельности человека (на консоль). Создайте конкретные классы "Студент" и "Профессор", наследующие от "Person".
Обоим классам в конструкторе должен передаваться предмет, который они изучают/преподают.
Создайте массив из 100 человек, которые посещают/преподают предмет программирование, чередуя студентов и профессоров.
Вызовите метод "выводитьДеятельность" для всех 100 человек. Для студента должен быть такой вывод:
"Студент посещает предмет Программирование."
Для профессора должен быть такой вывод:
"Профессор преподает Программирование."
Как можно адекватно протестировать классы с помощью JUnit-тестов?
 */

package collections.abstracktperson;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String subject;

    public Person(String firstName, String lastName, String subject) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    public abstract void gibTaetigkeitAus();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
