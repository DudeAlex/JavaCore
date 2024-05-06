package collections.drittenPunkt;

public class Punkt {

    int a;
    int b;
    int c;

    public Punkt(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateDistance(){
        double d = Math.sqrt(a*a + b*b + c*c);
        return d;
    }

    public String toString(){
        String output = "a=" + a + " " + "b=" + b + " " + "c=" + c;

        return output;
    }
}

