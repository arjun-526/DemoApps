package net.vinayaka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping(value = "/hello/{name}")
    public String helloApp(@PathVariable("name") String name) {
        return name + "Welcome to Demo Controller";
    }
}
