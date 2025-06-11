package collections.viertesemester.aufgabefahrzeuge.twotter;

public class User {

    private final String benutzername;
    private String passwort;


    public User(String benutzername, String passwort){
        this.benutzername = benutzername;
        this.passwort = passwort;
    }

    public String getBenutzername() {
        return benutzername;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }
}
