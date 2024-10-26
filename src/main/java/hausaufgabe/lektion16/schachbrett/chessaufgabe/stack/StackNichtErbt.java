package hausaufgabe.lektion16.schachbrett.chessaufgabe.stack;

import java.util.ArrayList;

public class StackNichtErbt implements StackInterface{

    private ArrayList<Object> stack;

    public StackNichtErbt(){
        stack = new ArrayList<>();
    }

    public boolean push(Object o){
        return stack.add(o);
    }

    public Object pop(){
        if(stack.isEmpty()) throw new RuntimeException("Stack ist leer");

        return stack.remove(stack.size()-1);
    }
}
