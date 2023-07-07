package fasttrackit.chatApp.models;

import lombok.Data;

@Data
public class Message {
    private final String text;

    public Message(String text) {
        this.text = text;
    }
}
