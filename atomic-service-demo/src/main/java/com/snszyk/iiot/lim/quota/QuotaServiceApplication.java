package com.snszyk.iiot.lim.quota;

import io.ttyys.core.support.springboot.EnableTYSupport;
import io.ttyys.core.support.springboot.SpringBootAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication(scanBasePackages = {"com.snszyk.iiot.lim.quota"})
@EnableTYSupport(servicePackages = {"com.snszyk.iiot.lim.quota.application"})
public class QuotaServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuotaServiceApplication.class, args);
    }
}
