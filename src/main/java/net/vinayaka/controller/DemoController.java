package net.vinayaka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/welcome/{name}")
    public String welcome(@PathVariable("name") String name) {
        return name + ", Welcome to Demo Controller";
    }
}
