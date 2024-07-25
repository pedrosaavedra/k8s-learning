package com.k8s.app_one;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/app-one/hello")
    public String sayHello(){
        return "Hello I m API One";
    }
}
