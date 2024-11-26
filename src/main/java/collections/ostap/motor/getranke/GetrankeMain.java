package collections.ostap.motor.getranke;

public class GetrankeMain {
    public static void main(String[] args) {

        Getranke[] getraenke = new Getranke[3];

        getraenke[0] = new Bier("qwe", "weizen", 12.0, 25);
        getraenke[1] = new Weisswein("asd", "silvaner", 1.25, 50, 1990);
        getraenke[2] = new Rotwein("zxc", "domina", 1.34, 10, 2022);


        for(Getranke g : getraenke){

        }



    }
}
