package com.asksrc.sample.job;

import com.asksrc.sample.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.asksrc.sample")
public class MyJob {

    private final MyService myService;

    public MyJob(MyService myService) {
        this.myService = myService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyJob.class, args);
    }
}
