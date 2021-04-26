package com.asksrc.sample.service;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyServiceTest {

    @Autowired
    private MyService myService;

    @Test
    public void contextLoads() {
        MatcherAssert.assertThat(myService.getMessage(), Matchers.is("Hello core"));
    }

    @SpringBootApplication
    static class TestConfiguration {
    }

}
