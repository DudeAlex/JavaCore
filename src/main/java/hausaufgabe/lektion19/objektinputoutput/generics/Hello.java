package hausaufgabe.lektion19.objektinputoutput.generics;

public class Hello <E> {
    E e;

    public Hello (E e){
        this.e = e;
    }
    public void greeting(){
        System.out.println(e.toString());
    }
}
