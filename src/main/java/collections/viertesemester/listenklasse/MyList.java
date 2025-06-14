package collections.viertesemester.listenklasse;

import java.util.Collection;

public class MyList<E> {

    private final Collection<? extends E> connection;


    public MyList(Collection <? extends E> c){
        this.connection = c;
    }


    public boolean add(E e){
        returnError();
        return false;
    }

    public boolean addAll(Collection<? extends E> c){
        returnError();
        return false;
    }
    public void add(int index, E element){
        System.out.println("MuList ist immutable");
    }
    public boolean addAll(int index, Collection<? extends E> c){
        returnError();
        return false;
    }

    public void returnError(){
        throw new UnsupportedOperationException("MuList ist immutable");
    }

}
