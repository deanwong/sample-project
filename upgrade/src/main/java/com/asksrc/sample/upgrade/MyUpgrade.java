package com.asksrc.sample.upgrade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.asksrc.sample")
public class MyUpgrade {

    public static void main(String[] args) {
        SpringApplication.run(MyUpgrade.class, args);
    }

    @Bean
    public FlywayMigrationStrategy flywayMigrationStrategy() {
        return flyway -> {
            // manually
            System.out.println("flyway migration");
            flyway.migrate();
        };
    }
}
