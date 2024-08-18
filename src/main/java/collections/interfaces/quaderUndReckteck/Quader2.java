package collections.interfaces.quaderUndReckteck;

import collections.interfaces.rechteck.Rechteck;

public class Quader2 {


        double tiefe;
        Rechteck2 rechteck2;

        public Quader2(double laenge, double breite, double tiefe) {
            rechteck2 = new Rechteck2(laenge, breite);
            this.tiefe = tiefe;
        }

        public double berechneVolumen() {
            return rechteck2.berechneFlaeche() * tiefe;
        }
    }
