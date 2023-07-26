package fasttrackit.chatApp.controller;

import fasttrackit.chatApp.models.User;
import fasttrackit.chatApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("chatApp-user")
public class UserController {
    @Autowired
    UserService service;

    @GetMapping("user")
    public List<User> getAllUser() {return service.getUserList();}
    @PostMapping("addNewUser")
    public User addNewUser(@RequestBody User user) {return service.add(user);}
}
