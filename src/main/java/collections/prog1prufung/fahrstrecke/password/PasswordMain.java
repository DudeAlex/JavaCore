package collections.prog1prufung.fahrstrecke.password;

public class PasswordMain {
    public static void main(String[] args) {

        Password password = new Password("Prog1Und2");

        System.out.println(password);

        System.out.println(password.change());

        System.out.println();
        System.out.println(password.pwAendern("Frog1Und3"));


    }

}
