package fasttrackit.chatApp.service;

import fasttrackit.chatApp.Repository.ChatRepository;
import fasttrackit.chatApp.models.Chat;
import fasttrackit.chatApp.models.ChatDto;
import fasttrackit.chatApp.models.Message;
import fasttrackit.chatApp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {
    @Autowired
    private ChatRepository chatRepository;

    @Autowired
    private UserService userService;

    public Chat addWithUsers(ChatDto chat) {
        User user1 = userService.findByName(chat.getUserTo());
        User user2 = userService.findByName(chat.getUserFrom());
        Chat newChat= new Chat();
        newChat.setUsers(new ArrayList<>());
        newChat.addUser(user1);
        newChat.addUser(user2);
        return chatRepository.save(newChat);
    }


    public Chat add(Chat chat) {
       return chatRepository.save(chat);
    }

    public Chat getById(Long id) {
        return chatRepository.findById(id).orElseThrow();
    }

    public void saveChat(Chat chat) {
        chatRepository.save(chat);
    }

    public List<Message> getMessages(Long id) {
        return chatRepository.findById(id).orElseThrow().getMessages();
    }

    public void addMessage(Long id, Message message) {
        Chat chat = chatRepository.findById(id).orElseThrow();
        User user = userService.findByName(message.getSender().getName());
        message.setSender(user);
        chat.getMessages().add(message);
        chatRepository.save(chat);
    }
}
