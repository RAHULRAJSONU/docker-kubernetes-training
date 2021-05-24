package io.github.rahulrajsonu.scheduledjob;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false) String name){
        Objects.requireNonNull(name,"Please tell me your name...");
        return "Hello ".concat(name);
    }
}
