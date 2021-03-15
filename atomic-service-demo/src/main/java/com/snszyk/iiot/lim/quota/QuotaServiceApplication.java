package com.snszyk.iiot.lim.quota;

import io.ttyys.algo.springboot.EnableDataSupport;
import io.ttyys.core.support.springboot.EnableEnhanceSupport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SuppressWarnings("SpringFacetCodeInspection")
@SpringBootApplication(scanBasePackages = {"com.snszyk.iiot.lim.quota"})
@EnableEnhanceSupport(
        servicePackages = {"com.snszyk.iiot.lim.quota.application"},
        mapperPackages = {"com.snszyk.iiot.lim.quota.infrastructure.ports.mybatis"})
@EnableDataSupport
public class QuotaServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuotaServiceApplication.class, args);
    }
}
