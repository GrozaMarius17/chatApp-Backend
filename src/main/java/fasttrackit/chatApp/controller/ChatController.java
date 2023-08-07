package fasttrackit.chatApp.controller;

import fasttrackit.chatApp.models.Chat;
import fasttrackit.chatApp.models.ChatDto;
import fasttrackit.chatApp.models.Message;
import fasttrackit.chatApp.models.User;
import fasttrackit.chatApp.service.ChatService;
import fasttrackit.chatApp.service.MessagesService;
import fasttrackit.chatApp.service.UserService;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("chats")
public class ChatController {

    @Autowired
    UserService userService;
    @Autowired
    ChatService chatService;
    @Autowired
    MessagesService messagesService;
    @PersistenceContext
    EntityManager entityManager;

     @PostConstruct
    public void init() {
        User ionut = User.builder().name("Ionut").build();
        User marius = User.builder().name("Marius").build();
        userService.add(ionut);
        userService.add(marius);
        ionut = entityManager.find(User.class,1L);
        marius = entityManager.find(User.class,2L);
        chatService.add(Chat.builder().build());
        Chat chat1 = entityManager.find(Chat.class,1L);
        chat1.setMessages(
                        List.of(
                                Message.builder().text("Hello").sender(ionut).build(),
                                Message.builder().text("How are you").sender(marius).build()));
        chat1.addUser(ionut);
        chat1.addUser(marius);
        chatService.saveChat(chat1);
    }

    @GetMapping("/{id}/messages")
    public List<Message> getMessages(@PathVariable Long id) {return chatService.getMessages(id);}

    @PostMapping("/{id}/messages")
    public List<Message> addMessage(@PathVariable Long id, @RequestBody Message message) {
         chatService.addMessage(id, message);
         return chatService.getMessages(id);
    }

    @PostMapping
    public Chat addChat(@RequestBody ChatDto chat) {
         return chatService.addWithUsers(chat);
    }
}
