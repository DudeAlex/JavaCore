package collections.prog1prufung.fahrstrecke;

public class Route {

    Zielort last;

    public Route(){
    }


    public void add(Zielort zielort){
        if(last == null) last = zielort;
        else{
            Zielort current = last;
            while(current.next != null){
                current = current.next;
            }
            current.next = zielort;
        }
    }

    public int gesamtStrecke(){
        if(last == null) return 0;
        else {
            //int sum = 0;
            Zielort current = last;
            while (current.next != null){
                current = current.next;
                //sum += current.getDistanz();

            }
            return current.getDistanz();
        }
    }


}
