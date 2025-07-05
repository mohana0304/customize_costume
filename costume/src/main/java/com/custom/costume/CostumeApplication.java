package com.custom.costume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class CostumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CostumeApplication.class, args);
    }

    @Scheduled(fixedRate = 5000)
    public void keepAlive() {
        System.out.println("🟢 Application is alive at " + System.currentTimeMillis());
    }
}

