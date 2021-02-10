package com.snszyk.iiot.lim.quota;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.snszyk.iiot.lim.quota"})
public class QuotaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuotaServiceApplication.class, args);
    }

}
