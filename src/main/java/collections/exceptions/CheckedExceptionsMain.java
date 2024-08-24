package collections.exceptions;

import java.io.IOException;

public class CheckedExceptionsMain {
    public static void main(String[] args) throws IOException {
        //System.out.println(getNumber());

        char c = (char) System.in.read();
        System.out.println(c);
    }

    public static int getNumber() throws IOException {
        return System.in.read();
    }


}
