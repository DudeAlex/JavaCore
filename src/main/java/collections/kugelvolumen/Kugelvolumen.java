package collections.kugelvolumen;

public class Kugelvolumen {
    public static double berechneKugelvolumen(double radius) {

       if(radius<0) throw new RuntimeException("radius must be positiv");
       return 4.0/3.0*Math.PI*(radius*radius*radius);

        }
    }

