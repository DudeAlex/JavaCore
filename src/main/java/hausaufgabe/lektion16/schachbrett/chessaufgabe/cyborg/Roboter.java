package hausaufgabe.lektion16.schachbrett.chessaufgabe.cyborg;

public class Roboter implements GleicheProzess{

    public void aufladen(){
    }
    public void warten(){
    }

    @Override
    public void arbeiten() {
    }

    @Override
    public void autofahren() {
    }

    @Override
    public Entscheidung entscheide(Situation situation) {

        if(situation.equals(Situation.GEFAHR_LINKS)) return Entscheidung.RECHTS;
        else if(situation.equals(Situation.GEFAHR_RECHTS)) return Entscheidung.LINKS;
        else if(situation.equals(Situation.GEFAHR_VORNE)) return Entscheidung.BREMSEN;
        return null;
    }
}
