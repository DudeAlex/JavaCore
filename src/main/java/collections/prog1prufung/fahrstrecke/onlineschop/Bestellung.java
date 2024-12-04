package collections.prog1prufung.fahrstrecke.onlineschop;

public class Bestellung {

    int nummer;

    Artikel[] artikels = new Artikel[50];


    public void add(Artikel artikel){
        for(int i = 0; i < artikels.length; i++){
            if(artikels[i] == null) {
                artikels[i] = artikel;
                break;
            }
        }
    }


   //todo
    public void delete(Artikel artikel){
        for(int i = 0; i < artikels.length; i++){
            if(artikels[i] == artikel) {
                artikels[i] = artikels[i + 1];
                if(artikels[i + 1] == null) break;
            } else {
                artikels[i] = artikels[i + 1];
            }
        }
    }
}
