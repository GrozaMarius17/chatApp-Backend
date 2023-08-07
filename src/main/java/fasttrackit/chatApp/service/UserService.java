package fasttrackit.chatApp.service;

import fasttrackit.chatApp.Repository.UserRepository;
import fasttrackit.chatApp.models.Chat;
import fasttrackit.chatApp.models.Message;
import fasttrackit.chatApp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    List<User> userList;

    public List<User> getUserList() {
        return repository.findAll();
    }

    public User add(User user) {
        repository.save(user);
        return user;
    }

    public User getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void save(User user1) {
        repository.save(user1);
    }

    public User findByName(String name) {
        return repository.findByName(name);
    }

    public List<Chat> getChats(Long id) {
        return repository.findById(id).orElseThrow().getChats();
    }
}
