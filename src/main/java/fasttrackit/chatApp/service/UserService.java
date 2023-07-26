package fasttrackit.chatApp.service;

import fasttrackit.chatApp.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> userList;

    public UserService() {
        this.userList = new ArrayList<>();
        this.userList.add(new User("Marius"));
        this.userList.add(new User("Raluca"));
    }

    public List<User> getUserList() {return userList;}

    public User add(User user) {
        userList.add(user);
        return user;
    }
}
