package com.SpringOAuth2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello World";
    }
    @GetMapping("/helloSecured")
    public String HelloSecured(){
        return "Hello World with Security";
    }
}
