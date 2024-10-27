package hausaufgabe.lektion16.schachbrett.chessaufgabe.cyborg;

public class Mensch implements GleicheProzess{


    public void essen(){
    }
    public void schlaffen(){
    }

    @Override
    public void arbeiten() {
    }

    @Override
    public void autofahren() {
    }

    @Override
    public Entscheidung entscheide(Situation situation) {
        if(Math.random() < 0.25) return Entscheidung.UNENTSCHIEDEN;

        if(situation.equals(Situation.GEFAHR_LINKS)) return Entscheidung.RECHTS;
        else if(situation.equals(Situation.GEFAHR_RECHTS)) return Entscheidung.LINKS;
        else if(situation.equals(Situation.GEFAHR_VORNE)) return Entscheidung.BREMSEN;
        return null;
    }
}
