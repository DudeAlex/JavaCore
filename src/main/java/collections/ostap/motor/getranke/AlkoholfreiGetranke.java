package collections.ostap.motor.getranke;

public class AlkoholfreiGetranke extends Getranke implements Pfand {

    public AlkoholfreiGetranke(String herkunft, String sorte, double alkoholgehalt, int flaschengroesse, int pfand){
        super(herkunft, sorte, alkoholgehalt, flaschengroesse);
        this.pfand = pfand;
    }

    @Override
    public int flaschenpfand(){
        return pfand;
    }


}
