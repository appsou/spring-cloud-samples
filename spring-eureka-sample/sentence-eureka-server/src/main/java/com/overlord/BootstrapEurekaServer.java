package com.overlord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by lidongdong on 2017/3/7.
 */
@SpringBootApplication
@EnableEurekaServer
public class BootstrapEurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(BootstrapEurekaServer.class, args);
    }
}
