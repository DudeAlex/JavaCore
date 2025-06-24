package collections.viertesemester.pizzabuilder;

public class PizzaMain {
    public static void main(String[] args) {

        Pizza pizza = new Pizza.PizzaBuilder("Large")
                .withKaese(true)
                .withSchinken(true)
                .build();

        System.out.println(pizza);

    }
}
