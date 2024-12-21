package collections.prog1prufung.fahrstrecke.flasche;

public class Flasche {

    private String name;
    private String text;
    private int kapazitat;
    private int fullstand;

    public Flasche(String name, String text, int kapazitat) {
        if(kapazitat < 0) throw new RuntimeException("Kapazität muss positiv sein");
        this.name = name;
        this.text = text;
        this.kapazitat = kapazitat;
        this.fullstand = kapazitat;
    }

    public String getName() {
        return name;
    }
    public String getText() {
        return text;
    }
    public int getKapazitat() {
        return kapazitat;
    }
    public int getFullstand() {
        return fullstand;
    }

    /*
    Напишите метод ReduceFillLevel. Количество, которое нужно уменьшить (целое число в мл),
    должно быть передано в метод в качестве параметра.
Возвращаемое количество - это количество, которое может быть реально удалено.
     */

    public int reduziereFuellstand(int ml){
        if(fullstand > ml)  fullstand -= ml;
        else fullstand = 0;
        return fullstand;

    }
    public boolean istLeer(){
        return fullstand <= 0;
    }

}
