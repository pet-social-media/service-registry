package com.enzulode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SocialMediaServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocialMediaServiceRegistryApplication.class, args);
    }
}
