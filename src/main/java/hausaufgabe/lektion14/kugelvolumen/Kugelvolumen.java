package hausaufgabe.lektion14.kugelvolumen;

public class Kugelvolumen {
    //double radius;


    /*public Kugelvolumen(double radius){
        if(radius < 0) throw new IllegalArgumentException("radius must be positiv");
        this.radius = radius;
    }*/


    public double berechneKugelvolumen(double radius) {
       if(radius < 0) throw new RuntimeException("radius must be positiv");
       return (4.0/3.0) * Math.PI*(radius*radius*radius);
        //return (4.0 / 3.0) * Math.PI * Math.pow(this.radius, 3);
    }
    }

