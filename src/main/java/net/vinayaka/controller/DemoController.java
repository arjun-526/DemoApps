package net.vinayaka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/welcome/{name}")
    public String welcome(@PathVariable("name") String name) {
        return name + " , Come to here";
    }

    @GetMapping("/welcome")
    public String hello() {
        return "Welcome to Demo App";
    }
}
