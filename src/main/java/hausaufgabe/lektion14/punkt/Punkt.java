package hausaufgabe.lektion14.punkt;

public class Punkt {
    int x;
    int y;
    public void verschiebePunkt(int zielX, int zielY) {
        if (zielX < 0 || zielY < 0) throw new RuntimeException("keine negative Zahlen");
        else if (zielX > 1920) throw new RuntimeException("X kann nicht größer als 1920 sein");
        else if(zielY > 1080) throw new RuntimeException("Y kann nicht größer als 1080 sein");

        x = zielX;
        y = zielY;
    }
}
