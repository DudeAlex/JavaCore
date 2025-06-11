package collections.viertesemester.aufgabefahrzeuge.twotter;

import javax.print.attribute.standard.MediaSize;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UserManager implements ObjectManager<User> {

    String userData = "users.dat";


    @Override
    public void serialize(List<User> users) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(userData))) {
            oos.writeObject(users);
            System.out.println("File has been written");
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<User> deserialize() {
        List<User> newUsers = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(userData))) {
            newUsers = ((List<User>) ois.readObject());
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
        for (User p : newUsers) {
            System.out.printf("Name: %s \n", p.getBenutzername());
        }

        return newUsers;
    }
}
