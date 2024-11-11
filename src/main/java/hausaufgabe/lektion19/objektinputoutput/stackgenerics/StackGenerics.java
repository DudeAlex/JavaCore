package hausaufgabe.lektion19.objektinputoutput.stackgenerics;

import java.util.ArrayList;

public class StackGenerics<T> implements StackGenericsInterface<T>  {

    private ArrayList<T> stack;

    public StackGenerics(){
        stack = new ArrayList<>();
    }
    @Override
    public boolean push(T t) {
        return stack.add(t);
    }

    @Override
    public T pop() {
        if (stack.isEmpty()) throw new RuntimeException("Stack ist leer");

        return stack.remove(stack.size() - 1);
    }
}
