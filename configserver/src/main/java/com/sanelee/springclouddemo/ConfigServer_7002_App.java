package com.sanelee.springclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer_7002_App {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer_7002_App.class,args);
    }
}
