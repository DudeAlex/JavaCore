package hausaufgabe.lektion23.ListofAsList.mathematik;

public class MethematikMain {
    public static void main(String[] args) {

        Mathematik mathematik = new Mathematik();

        System.out.println(mathematik.summieren(3, 5));


        Calculation calculation = new Calculation() {
            @Override
            public int operation(int a, int b) {
                return a+b;
            }
        };

        System.out.println(calculation.operation(6, 9));


        Calculation summe = (a, b) -> a+b;
        Calculation minus = (a, b) -> a-b;
        System.out.println(minus.operation(10, 8));
        Calculation mult = (a, b) -> a*b;
        Calculation div = (a,b) -> a/b;


        System.out.println(calculator(7, 8, mult));
        System.out.println(calculator(3, 12, (a, b) -> a*b));
        System.out.println(calculator(3, 12, (m, n) -> m*n));
    }

    public static int calculator(int a, int b, Calculation calculation){
        return calculation.operation(a,b);
    }




}


