package collections.viertesemester.befehlssystemenum;

public class EnumMain {
    public static void main(String[] args) {

        Befehl[] befehls = Befehl.values();

        for(Befehl b : befehls){
            b.ausfuehren();
        }


    }


}
