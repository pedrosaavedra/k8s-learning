package com.k8s.app_one;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @Value("${message}")
    private String message;

    @Value("${os}")
    private String osMessage;

    @GetMapping("/app-one/hello")
    public String sayHello(){
        return message + " " + osMessage;
    }
}
