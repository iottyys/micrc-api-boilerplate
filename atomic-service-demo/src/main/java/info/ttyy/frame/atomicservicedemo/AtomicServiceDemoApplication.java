package info.ttyy.frame.atomicservicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"info.ttyy.frame.atomicservicedemo"})
public class AtomicServiceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtomicServiceDemoApplication.class, args);
    }

}
