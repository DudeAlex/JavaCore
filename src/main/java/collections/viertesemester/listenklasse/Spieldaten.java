package collections.viertesemester.listenklasse;

import java.util.ArrayList;
import java.util.List;

public class Spieldaten {

    private final int geld;
    private List<String> spielerIDs;

    public Spieldaten(int geld, List<String> spielerIDs) {

        this.geld = geld;
        this.spielerIDs = spielerIDs;

    }


    public int getGeld() {
        return geld;
    }

    public List<String> getSpielerIDs() {
        return spielerIDs;
    }

    @Override
    public String toString() {
        return "Spieldaten{" +
                "geld=" + geld +
                ", spielerIDs=" + spielerIDs +
                '}';
    }

    public static class SpieldatenBuilder{

        private int geld;
        private final List<String> spielerIDs = new ArrayList<>();

        private boolean canAdd = true;


        public SpieldatenBuilder geld(int geld){
            this.geld = geld;
            return this;
        }

        public SpieldatenBuilder add(String id){
            this.spielerIDs.add(id);
            return this;
        }

        public Spieldaten build(){

            if(canAdd) {
                canAdd = false;
                return new Spieldaten(geld, spielerIDs);
            }

            else{
                throw new UnsupportedOperationException("Can not add");
            }
        }

    }
}
