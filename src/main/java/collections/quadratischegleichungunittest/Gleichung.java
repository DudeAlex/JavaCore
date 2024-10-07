package collections.quadratischegleichungunittest;

public class Gleichung {

    double a;
    double b;
    double c;
    final double DELTA = 0.00001;

    public Gleichung(double a, double b, double c){
        if (Math.abs(a) < DELTA) throw new RuntimeException("a darf nicht 0 sein");

        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double[] roots() {
        double diskriminante = Math.pow(b,2) - 4*a*c;
        double[] lsg;
        if(diskriminante < 0) {
            lsg = null;
        } else if (Math.abs(diskriminante) < DELTA) {
            lsg = new double[1];
            double x12 = (-b+Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
            lsg[0] = x12;
        } else{
            lsg = new double[2];
            double x1 = (-b+Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
            double x2 = (-b-Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
            lsg[0] = x1;
            lsg[1] = x2;
        }

        //double erg1 = (-b+Math.sqrt(Math.pow(b,2) - 4*a*c)) / 2*a;

        return lsg;
    }
}
