package hausaufgabe.lektion17.exceptionsaufgabe;

public class NumberFormatExceptionMain {
    public static void main(String[] args) {
        String numberStr = "abc";
        try{
            int number = Integer.parseInt(numberStr); // Здесь будет выброшено NumberFormatException
            System.out.println(number);

        } catch (NumberFormatException e){
            System.out.println("Неверные числа, проверьте число " + numberStr);
        }
    }
}
