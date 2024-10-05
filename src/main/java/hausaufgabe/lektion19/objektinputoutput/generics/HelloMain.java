package hausaufgabe.lektion19.objektinputoutput.generics;

public class HelloMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.marke = "bmw";
        Person person = new Person();
        person.name = "Vasya";
        Hello<Person> hello = new Hello<>(person);
        hello.greeting();

        Hello<Car> hello2 = new Hello<>(car);
        hello2.greeting();
    }
}
