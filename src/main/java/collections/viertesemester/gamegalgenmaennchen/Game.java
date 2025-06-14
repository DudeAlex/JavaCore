package collections.viertesemester.gamegalgenmaennchen;

public interface Game {

    void reset();

    String initGameString();

    String handleInput(String line);

    boolean running();

    String welcomeString();
}
