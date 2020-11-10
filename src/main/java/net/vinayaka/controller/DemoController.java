package net.vinayaka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping(value = "/hello")
    public String helloApp(){
        return "Welcome to Demo Controller";
    }
}
