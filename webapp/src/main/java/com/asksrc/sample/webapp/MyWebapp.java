package com.asksrc.sample.webapp;

import com.asksrc.sample.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.asksrc.sample")
@RestController
public class MyWebapp {

    private final MyService myService;

    public MyWebapp(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/message")
    public String message() {
        return myService.getMessage();
    }

    public static void main(String[] args) {
        SpringApplication.run(MyWebapp.class, args);
    }
}
