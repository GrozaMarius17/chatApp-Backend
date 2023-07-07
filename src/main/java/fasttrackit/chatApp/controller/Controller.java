package fasttrackit.chatApp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("chatApp")
public class Controller {
    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.of(Optional.of("Marius"));
    }
}
