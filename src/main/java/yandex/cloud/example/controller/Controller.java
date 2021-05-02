package yandex.cloud.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class Controller {

    @GetMapping("/")
    public ResponseEntity<LocalDateTime> getCurrentTime(Model model) {
        return ResponseEntity.ok(LocalDateTime.now());
    }
}
