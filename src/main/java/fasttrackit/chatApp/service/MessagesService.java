package fasttrackit.chatApp.service;

import fasttrackit.chatApp.Repository.MessageRepository;
import fasttrackit.chatApp.models.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MessagesService {
    /*List<Message> messagesList = List.of(new Message("Hello"),new Message("My name is Marius"));*/
    ArrayList<Message> messageArrayList = new ArrayList<>();
    @Autowired
    private MessageRepository repository;


    public ArrayList<Message> getMessageArrayList() {
        return messageArrayList;
    }


    public List<Message> getAllMessages() {
        return null;
    }

    public Message add(Message message) {
        messageArrayList.add(message);
        return message;
    }

    public Message getById(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
