package collections.exceptions.exceptionsaufgabe;

public class NullPointerExceptionMain{
    public static void main(String[] args) {

        String str = null;
        try{
            int length = str.length();
        } catch (NullPointerException e){
            System.out.println("Неправильная ссылка");
        }
    }
}
