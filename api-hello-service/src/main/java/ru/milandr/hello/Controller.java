package ru.milandr.hello;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class Controller {

    @GetMapping("micro_view")
    public ResponseEntity<String> view() {
        return ResponseEntity.ok("<div>Hello from service 1</div>");
    }
}
