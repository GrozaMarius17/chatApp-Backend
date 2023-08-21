package fasttrackit.chatApp.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue
    private long id;
    @Column
    @JsonProperty("name")
    private String name;

    @ManyToMany (fetch = FetchType.EAGER, mappedBy = "users")
    @Builder.Default
    private List<Chat> chats = new ArrayList<>();
}
