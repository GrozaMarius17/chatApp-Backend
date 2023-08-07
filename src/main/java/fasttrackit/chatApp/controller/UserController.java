package fasttrackit.chatApp.controller;

import fasttrackit.chatApp.models.Chat;
import fasttrackit.chatApp.models.User;
import fasttrackit.chatApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    UserService service;

    @GetMapping
    public List<User> getAllUser() {return service.getUserList();}

    @GetMapping("/{id}/chats")
    public List<Chat> getChats(@PathVariable Long id) {return service.getChats(id);}
    @PostMapping
    public User addNewUser(@RequestBody User user) {return service.add(user);}

}
