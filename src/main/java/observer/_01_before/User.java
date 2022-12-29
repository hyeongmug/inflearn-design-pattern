package observer._01_before;

import observer._01_before.ChatServer;

import java.util.List;

public class User {

    private ChatServer chatServer;

    public User(ChatServer chatServer) {
        this.chatServer = chatServer;
    }

    public List<String> getMessage(String subject) {
        return chatServer.getMessage(subject);
    }

    public void sendMessage(String subject, String message) {
        chatServer.add(subject, message);
    }
}
