package com.snszyk.iiot.lim.quota;

import io.ttyys.core.support.springboot.EnableEnhanceSupport;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.snszyk.iiot.lim.quota"})
@EnableEnhanceSupport(servicePackages = {"com.snszyk.iiot.lim.quota.application"})
@MapperScan("com.snszyk.iiot.lim.quota")
public class QuotaServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuotaServiceApplication.class, args);
    }
}
