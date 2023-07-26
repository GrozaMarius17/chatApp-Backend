package fasttrackit.chatApp.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty("name")
    private final String name;
    @JsonCreator
    public User(String name) {
        this.name = name;
    }
}
