package com.example.assignment;

import org.springframework.web.bind.annotation.*;
@RestController
public class UserControllerAPI {

    @GetMapping("/reverse")
    public String reverse(@RequestParam String word) {
        return  new StringBuilder(word).reverse().toString();
    }

    @GetMapping("/display")
    public String displayMessage() {
        return System.getenv("MY_MESSAGE");
    }
}
