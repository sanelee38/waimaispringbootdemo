package com.sanelee.springclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class SpringcloudDemo_7001_App {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudDemo_7001_App.class,args);
    }
}
