package com.hmzone.eureka.producerb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProducerbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerbApplication.class, args);
    }
}
