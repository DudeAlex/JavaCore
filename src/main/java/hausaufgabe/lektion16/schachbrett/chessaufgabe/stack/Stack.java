package hausaufgabe.lektion16.schachbrett.chessaufgabe.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack extends ArrayList <Object>{

    public boolean push(Object o){
        return this.add(o);
    }

    public Object pop() {
        if (this.isEmpty()) throw new RuntimeException("Stack ist leer");
        return this.remove(this.size() - 1);
    }
}
