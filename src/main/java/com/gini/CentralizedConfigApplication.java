package com.gini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer // -> so that config server to work
@SpringBootApplication
public class CentralizedConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CentralizedConfigApplication.class, args);
    }

}
