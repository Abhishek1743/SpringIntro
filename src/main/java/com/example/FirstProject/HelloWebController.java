package com.example.FirstProject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWebController {
    @GetMapping("/hello")
    public String Hello(){
        return "Hello from BridgeLabz";
    }

}
