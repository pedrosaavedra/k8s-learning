package com.k8s.app_two;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/app-two/hello")
    public String sayHello(){
        return "Hello I m API two";
    }
}
