package collections.viertesemester.iteratoreigenecollection;

public class IntRangeMain {

    public static void main(String[] args) {


        IntRange intRange = new IntRange(5,10);

        for(Integer ir : intRange){
            System.out.print(ir + " ");
        }

    }
}
