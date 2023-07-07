package fasttrackit.chatApp.service;

import fasttrackit.chatApp.models.Message;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessagesService {
    List<Message> messagesList = List.of(new Message("Hello"), new Message("My name is Marius"));
    public List<Message> getAllMessages() {
        return messagesList;
    }
}
