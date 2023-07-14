package fasttrackit.chatApp.controller;

import fasttrackit.chatApp.models.Message;
import fasttrackit.chatApp.service.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("chatApp")
public class Controller {
    @Autowired
    MessagesService service;
    @GetMapping("messages")
    public List<Message> getAllMessage() {
        return service.getAllMessages();
    }
    @RequestMapping("newMessages")
    public ArrayList<Message> getMessageArrayList() {
        return service.getMessageArrayList();
    }

    @PostMapping("addNewMessage")
    public Message addNewMessage(@RequestBody Message message) {
        return service.add(message);
    }


}
