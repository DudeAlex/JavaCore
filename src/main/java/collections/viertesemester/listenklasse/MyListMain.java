package collections.viertesemester.listenklasse;

public class MyListMain {
    public static void main(String[] args) {




        Spieldaten.SpieldatenBuilder builder = new Spieldaten.SpieldatenBuilder();
        Spieldaten.SpieldatenBuilder builder1 = new Spieldaten.SpieldatenBuilder();



        Spieldaten spieldaten = builder.geld(1000)
                .add("abs")
                .add("xyz")
                .build();


        System.out.println(spieldaten);
        System.out.println();

        Spieldaten spieldaten1 = builder1.geld(500)
                .add("iop")
                .add("bnm")
                .build();

        System.out.println(spieldaten1);
        System.out.println();




        spieldaten = builder.add("asd").build();

        System.out.println(spieldaten);



    }
}
