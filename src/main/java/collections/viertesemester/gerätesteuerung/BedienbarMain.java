package collections.viertesemester.gerätesteuerung;

public class BedienbarMain {
    public static void main(String[] args) {
        Lampe lampe = new Lampe();
        Computer computer = new Computer();

        nacheinander(lampe, computer);
        
    }

    public static void nacheinander(Bedienbar... gerate){
        for(int i = 0; i < 14; i++){
            for(Bedienbar g : gerate){
                g.einschalten();
            }
            for(Bedienbar g : gerate){
                g.ausschalten();
            }
        }
    }
}
