package ru.milandr.uiservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("view")
public class ViewController {

    @GetMapping
    public String helloView() {
        return "view";
    }
}
