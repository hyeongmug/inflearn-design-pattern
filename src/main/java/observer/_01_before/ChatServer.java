package observer._01_before;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {

    private Map<String, List<String>> messages;

    public ChatServer() {
        messages = new HashMap<>();
    }

    public void add(String subject, String message) {
        if (!messages.containsKey(subject)) {
            messages.get(subject).add(message);
        } else {
            List<String> list = new ArrayList<>();
            list.add(message);
            messages.put(subject, list);
        }
    }

    public List<String> getMessage(String subject) {
        return messages.get(subject);
    }
}
