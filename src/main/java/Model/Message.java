package Model;

import java.util.ArrayList;

public class Message {
    private long massageID;
    private String playerID;
    private String message;
    // can not import LocalDateTime!!
    private static ArrayList<Message> allMessages;

    static {
        allMessages = new ArrayList<Message>();
    }

    public Message(String playerID, String message) {
        this.playerID = playerID;
        this.message = message;
        //LocalDateTime
        //massageID
        allMessages.add(this);
    }

    public static ArrayList<Message> getAllMessages() {
        return allMessages;
    }

    public String getPlayerID() {
        return null;
    }

    public String getMessage() {
        return message;
    }

    public long getMassageID() {
        return massageID;
    }
}
