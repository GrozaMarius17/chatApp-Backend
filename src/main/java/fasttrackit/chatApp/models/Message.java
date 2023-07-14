package fasttrackit.chatApp.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.boot.jackson.JsonComponent;

@Data
public class Message {
    @JsonProperty("text")
    private final String text;

    @JsonCreator
    public Message(String text) {
        this.text = text;
    }
}
