package fasttrackit.chatApp.controller;

import fasttrackit.chatApp.models.Message;
import fasttrackit.chatApp.service.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("chatApp")
public class Controller {
    @Autowired
    MessagesService service;
    @GetMapping
    public Message get() {
        return new Message("Marius");
    }
    @GetMapping("messages")
    public List<Message> getAllMessages() {
        return service.getAllMessages();
    }
}
