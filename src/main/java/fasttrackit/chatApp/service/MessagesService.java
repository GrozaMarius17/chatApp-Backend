package fasttrackit.chatApp.service;

import fasttrackit.chatApp.models.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MessagesService {
    List<Message> messagesList = List.of(new Message("Hello"),new Message("My name is Marius"));
    ArrayList<Message> messageArrayList = new ArrayList<>();


    public ArrayList<Message> getMessageArrayList() {
        return messageArrayList;
    }

    public List<Message> getAllMessages() {
        return messagesList;
    }

    public Message add(Message message) {
        messageArrayList.add(message);
        return message;
    }

}
