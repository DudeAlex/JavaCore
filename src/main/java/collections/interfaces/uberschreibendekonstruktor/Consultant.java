package collections.interfaces.uberschreibendekonstruktor;

public class Consultant extends Angestellter {
    int GEHALTSUNTERGRENZE = 55000;
    int GEHALTSOBERGRENZE = 80000;
    public Consultant(String name, String vorname, int gehalt) {
        super(name, vorname, gehalt);
        if (gehalt >= GEHALTSUNTERGRENZE && gehalt <= GEHALTSOBERGRENZE)
            this.gehalt = gehalt;
    }




    /*@Override -         неправильный код   (специально для сравнения. Тестируем ключевое слово final)
    public void setGehalt(int gehalt) {
        if (gehalt >= GEHALTSUNTERGRENZE && gehalt <= GEHALTSOBERGRENZE)
            this.gehalt = gehalt;
    }*/
}
