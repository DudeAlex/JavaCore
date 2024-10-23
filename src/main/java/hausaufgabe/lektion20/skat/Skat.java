package hausaufgabe.lektion20.skat;

import java.util.ArrayList;
import java.util.List;

public class Skat implements Comparable {

    private String name;
    private String type;

    private final List<String> cardNamesList = List.of("Valet,", "Ass", "10", "König", "Dame", "9", "8", "7");
    private final List<String> cardTypeList = List.of("Tref", "Pik", "Herz", "Karo");

    public Skat(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private int getNamePostion(Skat skat) {
        for (int i = 0; i < cardNamesList.size(); i++) {
            if (skat.getName().equals(cardNamesList.get(i))) {
                return i;
            }
        }
        throw new RuntimeException("Нет такой карты");
    }

    private int getCardTypePosition(Skat skat) {
        for (int i = 0; i < cardTypeList.size(); i++) {
            if (skat.getType().equals(cardTypeList.get(i))) {
                return i;
            }
        }
        throw new RuntimeException("Нет такой масти");
    }


    @Override
    public int compareTo(Object ob) {
        /*if(!(o instanceof Skat)) {
            o = (Skat) o;
        } else */

        Skat o = (Skat) ob;

        if (this.getName().equals(o.getName())) {
            if (this.getType().equals(o.getType())) return 0;
        } else {
            if (getCardTypePosition(this) > getCardTypePosition(o)) {
                return -1;
            } else {
                return 1;
            }
        }
        if (getNamePostion(this) > getNamePostion(o)) {

            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Skat{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
