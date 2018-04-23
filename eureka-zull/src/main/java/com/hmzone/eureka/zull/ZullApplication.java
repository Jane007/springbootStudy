package com.hmzone.eureka.zull;

import com.hmzone.eureka.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class ZullApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZullApplication.class, args);
    }
    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }
}
