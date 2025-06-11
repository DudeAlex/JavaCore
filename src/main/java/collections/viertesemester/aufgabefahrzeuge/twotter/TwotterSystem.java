package collections.viertesemester.aufgabefahrzeuge.twotter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwotterSystem {


    Map<User, List<Message>> map = new HashMap<>();

    public void addMessage(User user, Message message) {
        List<Message> messages = map.get(user);

        if (messages == null) {
            messages = new ArrayList<>();
            map.put(user, messages);
        }

        messages.add(message);
    }

}
