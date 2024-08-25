package collections.exceptions.exceptionsaufgabe;

public class ArrayIndexOutOfBoundsExceptionMain {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int i = -1;
        try {
            int number = numbers[i]; // Здесь будет выброшено ArrayIndexOutOfBoundsException
            System.out.println(number);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Нет индекса " + i);
        }
    }
}

